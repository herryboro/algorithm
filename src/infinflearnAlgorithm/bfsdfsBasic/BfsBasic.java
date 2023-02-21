package infinflearnAlgorithm.bfsdfsBasic;

import java.util.LinkedList;
import java.util.Queue;

class NodeBfsBasic {
    int data;
    NodeBfsBasic lt, rt;
    public NodeBfsBasic(int val) {
        data = val;
        lt = rt = null;
    }
}
public class BfsBasic {
    NodeBfsBasic root;
    public void BFS(NodeBfsBasic root){
        Queue<NodeBfsBasic> queue = new LinkedList<>();
        queue.add(root);
        int l = 0;

        while(!queue.isEmpty()) {
            int len = queue.size();
            System.out.print(l + " : ");

            for(int i = 0; i < len; i++) {
                NodeBfsBasic cur = queue.poll();
                System.out.print(cur.data + " ");
                if(cur.lt != null) queue.add(cur.lt);
                if(cur.rt != null) queue.add(cur.rt);
            }
            l++;
            System.out.println();
        }
    }
    public static void main(String[] args) {
        BfsBasic tree = new BfsBasic();
        tree.root = new NodeBfsBasic(1);
        tree.root.lt = new NodeBfsBasic(2);
        tree.root.rt = new NodeBfsBasic(3);
        tree.root.lt.lt = new NodeBfsBasic(4);
        tree.root.lt.rt = new NodeBfsBasic(5);
        tree.root.rt.lt = new NodeBfsBasic(6);
        tree.root.rt.rt = new NodeBfsBasic(7);
        tree.BFS(tree.root);
    }
}
