package theory.practice.chpater4;

public class Q4 {
    private int queue[];
    private int pointer;

    public Q4(int counter) {
        queue = new int[counter];
        pointer = 0;
    }

    public void enque(int data) {
        queue[pointer++] = data;
    }

    public void deque() {
        for (int i = 0; i < queue.length - 1; i++) {
            queue[i] = queue[i + 1];
        }
        pointer--;
    }

    public void dump() {
        for (int i = 0; i < pointer; i++)
            System.out.print(queue[i] + " ");
        System.out.println();
    }

    public static void main(String[] args) {
        Q4 q4 = new Q4(4);
        q4.enque(19);
        q4.enque(22);
        q4.enque(37);
        q4.enque(53);
        q4.deque();
        q4.enque(54);
        q4.deque();
        q4.deque();
        q4.enque(55);
        q4.enque(56);
        q4.dump();


//        q4.dump();
//        q4.deque();
//        q4.dump();
    }
}

/*
    ▣ 교재 풀이
    private int max; // 큐의 용량
    private int num; // 현재의 데이터 수
    private int[] que; // 큐의 본체

    // 생성자
    public Q4(int capacity) {
        num = 0;
        max = capacity;
        try {
            que = new int[max];         // 큐 본체용 배열을 생성
        } catch (OutOfMemoryError e) {   // 생성할 수 없습니다.
            max = 0;
        }
    }

    // 큐에 데이터를 인큐
    public int enque(int x) {
        que[num++] = x;
        return x;
    }

    // 큐에서 데이터를 디큐
    public int deque() {
        int x = que[0];
        for (int i = 0; i < num - 1; i++)
            que[i] = que[i + 1];
        num--;
        return x;
    }

    // 큐에서 데이터를 피크(머리 데이터를 살펴봄)
    public int peek() {
        return que[num - 1];
    }

    // 큐에서 x를 검색하여 index(찾지 못하면 -1)를 반환
    public int indexOf(int x) {
        for (int i = 0; i < num; i++)
            if (que[i] == x) // 검색성공
                return i;
        return -1; // 검색실패
    }

    // 큐를 비움
    public void clear() {
        num = 0;
    }

    // 큐의 용량을 반환
    public int capacity() {
        return max;
    }

    // 큐에 쌓인 데이터 수를 반환
    public int size() {
        return num;
    }

    // 큐가 비어 있는가?
    public boolean isEmpty() {
        return num <= 0;
    }

    // 큐가 가득 찼는가?
    public boolean isFull() {
        return num >= max;
    }

    // 큐 안의 데이터를 머리→꼬리의 차례로 출력함
    public void dump() {
        if (num <= 0)
            System.out.println("큐가 비었습니다.");
        else {
            for (int i = 0; i < num; i++)
                System.out.print(que[i] + " ");
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Q4 q4 = new Q4(4);
        q4.enque(19);
        q4.enque(22);
        q4.enque(37);
        q4.enque(53);
        q4.dump();
        q4.deque();
        q4.dump();
    }

 */