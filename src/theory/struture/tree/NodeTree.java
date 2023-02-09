package theory.struture.tree;

public class NodeTree {
    Node head;

    public void insertNode(int data) {
        if (this.head == null) {
            this.head = new Node(data);
        } else {
            Node node = this.head;

            while (true) {
                if (data < node.value) {
                    if (node.left != null) {
                        node = node.left;
                    } else {
                        node.left = new Node(data);
                        break;
                    }
                } else {
                    if (node.right != null) {
                        node = node.right;
                    } else {
                        node.right = new Node(data);
                        break;
                    }
                }
            }
        }
    }

    public Node search(int data) {
        if (this.head == null) {
            return null;
        } else {
            Node node = this.head;

            while (node != null) {
                if (data == node.value) {
                    return node;
                } else if (data < node.value) {
                    node = node.left;
                } else {
                    node = node.right;
                }
            }
        }
        return null;
    }

    public boolean delete(int value) {
        boolean searched = false;

        Node currParentNode = this.head;
        Node currNode = this.head;

        // 코너 케이스1: Node 가 하나도 없을 때
        if (this.head == null) {
            return false;
        } else {
            // 코너 케이스2: Node 가 단지 하나만 있고, 해당 Node 가 삭제할 Node 일 때
            if (this.head.value == value && this.head.left == null && this.head.right == null) {
                this.head = null;
                return true;
            }

            while (currNode != null) {
                if (currNode.value == value) {
                    searched = true;
                    break;
                } else if (value < currNode.value) {
                    currParentNode = currNode;
                    currNode = currNode.left;
                } else {
                    currParentNode = currNode;
                    currNode = currNode.right;
                }
            }

            if (searched == false) {
                return false;
            }
        }

        // 여기까지 실행되면,
        // currNode 에는 해당 데이터를 가지고 있는 Node,
        // currParentNode 에는 해당 데이터를 가지고 있는 Node 의 부모 Node
        // Case1: 삭제할 Node 가 Leaf Node 인 경우
        if (currNode.left == null && currNode.right == null) {
            if (value < currParentNode.value) {
                currParentNode.left = null;
                currNode = null;
            } else {
                currParentNode.right = null;
                currNode = null;
            }
            return true;
            // Case2-1: 삭제할 Node 가 Child Node를 한 개 가지고 있을 경우 (왼쪽에 Child Node 가 있을 경우)
        } else if (currNode.left != null && currNode.right == null) {
            if (value < currParentNode.value) {
                currParentNode.left = currNode.left;
                currNode = null;
            } else {
                currParentNode.right = currNode.left;
                currNode = null;
            }
            return true;
            // Case2-2: 삭제할 Node 가 Child Node를 한 개 가지고 있을 경우 (오른쪽에 Child Node 가 있을 경우)
        } else if (currNode.left == null && currNode.right != null) {
            if (value < currParentNode.value) {
                currParentNode.left = currNode.right;
                currNode = null;
            } else {
                currParentNode.right = currNode.right;
                currNode = null;
            }
            return true;
        // Case3-1: 삭제할 Node가 Child Node를 두 개 가지고 있을 경우
        } else {
            // 삭제할 Node가 Parent Node 왼쪽에 있을 때
            if (value < currParentNode.value) {
                // 삭제할 Node의 오른쪽 자식 중, 가장 작은 값을 가진 Node 찾기
                Node changeNode = currNode.right;
                Node changeParentNode = currNode.right;

                while (changeNode.left != null) {
                    changeParentNode = currNode;
                    changeNode = currNode.left;
                }
                // 여기까지 실행되면, changeNode 에는 삭제할 Node 의 오른쪽 자식 중, 가장 작은 값을 가진 Node 가 들어있음
                // Case 3-1-2: changeNode 의 오른쪽 Child Node 가 있을 때
                if (changeNode.right != null) {
                    changeParentNode.left = changeNode.right;
                    // Case 3-1-1: changeNode 의 Child Node 가 없을 때
                } else {
                    changeParentNode.left = null;
                }

                // currParentNode 의 왼쪽 Child Node 에, 삭제할 Node 의 오른쪽 자식중,
                // 가장 작은 값을 가진 changeNode 를 연결
                currParentNode.left = changeNode;

                // parentNode 의 왼쪽 Child Node 가 현재, changeNode 이고,
                // changeNode 의 왼쪽/오른쪽 Child Node 를 모두, 삭제할 currNode 의
                // 기존 왼쪽/오른쪽 Node 로 변경
                changeNode.right = currNode.right;
                changeNode.left = currNode.left;

                currNode = null;
            // Case3-2: 삭제할 Node 가 Child Node 를 두 개 가지고 있고, (삭제할 Node 가 부모 Node 의 오른쪽에 있을 때)
            } else {
                Node changeNode = currNode.right;
                Node changeParentNode = currNode.right;
                while (changeNode.left != null) {
                    changeParentNode = changeNode;
                    changeNode = changeNode.left;
                }
                // 여기까지 실행되면, changeNode 에는 삭제할 Node 의 오른쪽 Node 중에서,
                // 가장 작은 값을 가진 Node 가 들어있음

                if (changeNode.right != null) {
                    // Case 3-2-2: changeNode 의 오른쪽 Child Node 가 있을 때
                    changeParentNode.left = changeNode.right;
                } else {
                    // Case 3-2-1: changeNode 의 Child Node 가 없을 때
                    changeParentNode.left = null;
                }

                // currParentNode 의 오른쪽 Child Node 에, 삭제할 Node 의 오른쪽 자식중,
                // 가장 작은 값을 가진 changeNode 를 연결
                currParentNode.right = changeNode;

                // parentNode 의 왼쪽 Child Node 가 현재, changeNode 이고,
                // changeNode 의 왼쪽/오른쪽 Child Node 를 모두, 삭제할 currNode 의
                // 기존 왼쪽/오른쪽 Node 로 변경
                changeNode.right = currNode.right;
                changeNode.left = currNode.left;

                currNode = null;
            }
            return true;
        }
    }

    public static void main(String[] args) {
        NodeTree nodeTree = new NodeTree();
        nodeTree.insertNode(10);
        nodeTree.insertNode(15);
        nodeTree.insertNode(13);
        nodeTree.insertNode(11);
        nodeTree.insertNode(14);
        nodeTree.insertNode(18);
        nodeTree.insertNode(16);
        nodeTree.insertNode(19);
        nodeTree.insertNode(17);
        nodeTree.insertNode(7);
        nodeTree.insertNode(8);
        nodeTree.insertNode(6);

        System.out.println(nodeTree.delete(17));
        System.out.println("HEAD: " + nodeTree.head.value);
        System.out.println("HEAD LEFT: " + nodeTree.head.left.value);
        System.out.println("HEAD LEFT LEFT: " + nodeTree.head.left.left.value);
        System.out.println("HEAD LEFT RIGHT: " + nodeTree.head.left.right.value);

        System.out.println("HEAD RIGHT: " + nodeTree.head.right.value);
        System.out.println("HEAD RIGHT LEFT: " + nodeTree.head.right.left.value);
        System.out.println("HEAD RIGHT RIGHT: " + nodeTree.head.right.right.value);

        System.out.println("HEAD RIGHT RIGHT LEFT: " + nodeTree.head.right.right.left.value);
        System.out.println("HEAD RIGHT RIGHT RIGHT: " + nodeTree.head.right.right.right.value);
//        System.out.println("HEAD RIGHT RIGHT LEFT RIGHT: " + nodeTree.head.right.right.left.right.value);
    }
}

/*
    ※ insert 메서드
    public void insertNode(int data) {
        if (this.head == null) {
            this.head = new Node(data);
        } else {
            Node node = this.head;

            while (true) {
                if(data < node.value) {
                    if (node.left == null) {
                        node.left = new Node(data);
                        break;
                    } else {
                        node = node.left;
                    }
                } else {
                    if (node.right == null) {
                        node.right = new Node(data);
                        break;
                    } else {
                        node = node.right;
                    }
                }
            }
        }
    }
 */
