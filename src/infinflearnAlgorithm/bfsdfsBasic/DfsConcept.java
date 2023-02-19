package infinflearnAlgorithm.bfsdfsBasic;

class Node {
    int data;
    Node lt, rt;

    public Node(int val) {
        this.data = val;
        this.lt = this.rt = null;
    }
}

public class DfsConcept {
    Node root;

    public void dfsMethod(Node root) {
        if (root == null) {
            return;
        } else {
            /*
                전위 순회 방식
                순회 방식에 따른 출력 코드 위치 -> System.out.print(root.data + " ");
             */
            dfsMethod(root.lt);
            /*
                중위 순회 방식
             */
            System.out.print(root.data + " ");
            dfsMethod(root.rt);
            /*
                후위 순회 방식
             */
        }
    }

    public static void main(String[] args) {
        DfsConcept dfs = new DfsConcept();
        dfs.root = new Node(1);
        dfs.root.lt = new Node(2);
        dfs.root.rt = new Node(3);
        dfs.root.lt.lt = new Node(4);
        dfs.root.lt.rt = new Node(5);
        dfs.root.rt.lt = new Node(6);
        dfs.root.rt.rt = new Node(7);
        dfs.dfsMethod(dfs.root);
    }
}
