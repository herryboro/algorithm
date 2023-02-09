package theory.struture.hip;

import java.util.ArrayList;

public class Heap {
    public ArrayList<Integer> heapArray = null;

    public Heap (Integer data) {
        heapArray = new ArrayList<Integer>();
        heapArray.add(data);
    }

    public void insert(Integer data) {
        if (heapArray == null) {
            heapArray = new ArrayList<Integer>();
            heapArray.add(data);
        } else {
            heapArray.add(data);
        }
    }

    public static void main(String[] args) {
        Heap heap = new Heap(1);
        heap.insert(2);
        heap.insert(3);
        heap.insert(4);
        heap.insert(5);
        System.out.println(heap.heapArray);
    }
}
