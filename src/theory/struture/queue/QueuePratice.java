package theory.struture.queue;

import java.util.ArrayList;
import java.util.List;

public class QueuePratice<T> {
    private List<T> list = new ArrayList<>();

    public void enQueue(T a) {
        list.add(a);
    }

    public T dequeue() {
        if (list.isEmpty()) {
            return null;
        }
        System.out.println(list.toString());
        return list.remove(0);
    }

    public static void main(String[] args) {
        QueuePratice qp = new QueuePratice();
        System.out.println(qp.dequeue());
        qp.enQueue("하이");
        qp.enQueue("루");
        System.out.println(qp.dequeue());
        System.out.println(qp.dequeue());
        System.out.println(qp.dequeue());

    }
}
