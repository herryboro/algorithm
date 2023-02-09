package theory.struture.linkedlist;

public class SingleLinkedList<T> {
    private Node<T> head = null;

    public class Node<T> {
        public T data;
        public Node<T> next;

        public Node(T data) {
            this.data = data;
        }
    }

    public void printAll() {
        if (head != null) {
            Node<T> node = this.head;
            System.out.println(node.data);
            while (node.next != null) {
                node = node.next;
                System.out.println(node.data);
            }
        }
    }

    public void addNode(T data) {
        if (this.head == null) {
            this.head = new Node<T>(data);
        } else {
            Node<T> node = this.head;
            while (node.next != null) {
                node = node.next;
            }
            node.next = new Node<T>(data);
        }
    }

    public Node<T> searchNode(T searchData) {
        if (this.head == null) {
            return null;
        } else {
            Node<T> node = this.head;
            while (node.next != null) {
                if (node.data == searchData) {
                    return node;
                } else {
                    node = node.next;
                }
            }
            return null;
        }
    }

    public void addInsertNode(T insertData, T searchData) {
        Node<T> node = searchNode(searchData);

        if (node == null) {
            addNode(insertData);
        } else {
            Node<T> nextNode = node.next;
            node.next = new Node<T>(insertData);
            node.next.next = nextNode;
        }
    }

    public boolean delNode(T isData) {
        if (this.head == null) {
            return false;
        } else {
            Node<T> node = this.head;

            if (node.data == isData) {
                this.head = this.head.next;
                return true;
            } else {
                while (node.next != null) {
                    if (node.next.data == isData) {
                        System.out.println("next = " + node.next.next);
                        node.next = node.next.next;
                        return true;
                    }
                    node = node.next;
                }
                return false;
            }
        }
    }

    public static void main(String[] args) {
        SingleLinkedList<Integer> myLinkedList = new SingleLinkedList<Integer>();

        myLinkedList.addNode(1);
        myLinkedList.addNode(2);
        myLinkedList.addNode(3);
        myLinkedList.addNode(4);
        myLinkedList.addNode(5);

        myLinkedList.delNode(5);
//        myLinkedList.addNode(1);
//        myLinkedList.addInsertNode(2, 1);
        myLinkedList.printAll();
    }
}
