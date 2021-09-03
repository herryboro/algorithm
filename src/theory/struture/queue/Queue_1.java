package theory.struture.queue;

import java.util.LinkedList;
import java.util.Queue;

public class Queue_1 {
    public static void main(String[] args) {
        Queue<Integer> queue_int = new LinkedList<Integer>();
        Queue<String> queue_str = new LinkedList<String>();

        queue_int.add(1);
        System.out.println(queue_int.offer(2));
        System.out.println(queue_int.offer(2));
        System.out.println(queue_int);
    }
}
