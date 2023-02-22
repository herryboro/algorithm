package infinflearnAlgorithm.bfsdfsBasic;

class NodeTerminal {
    int data;
    NodeTerminal lt, rt;

    public NodeTerminal(int data) {
        this.data = data;
        this.lt = null;
        this.rt = null;
    }
}


public class TerminalNode {
    NodeTerminal nodeT;

    public int dfsTerminal(NodeTerminal node, int l) {
        if (node.lt == null && node.rt == null) {
            return l;
        } else {
            return Math.min(dfsTerminal(node.lt, l + 1), dfsTerminal(node.rt, l + 1));
        }
    }


    public static void main(String[] args) {
        TerminalNode node = new TerminalNode();
        node.nodeT = new NodeTerminal(1);
        node.nodeT.lt = new NodeTerminal(2);
        node.nodeT.rt = new NodeTerminal(3);
        node.nodeT.lt.lt = new NodeTerminal(4);
        node.nodeT.lt.rt = new NodeTerminal(5);
        System.out.println(node.dfsTerminal(node.nodeT, 0));
    }
}
