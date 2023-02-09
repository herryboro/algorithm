package theory.exmaple.chapter4;

import java.util.Scanner;

public class P1 {
    private int ptr;			// 스택 포인터
    private int[] stk;			// 스택 본체

    // 생성자
    public P1(int capacity) {
        ptr = 0;
        stk = new int[capacity];				// 스택 본체용 배열을  생성
    }

    // 스택에 x를 푸시
    public int push(int x) {
        return stk[ptr++] = x;
    }

    // 스택에서 데이터를 팝(정상에 있는 데이터를 꺼냄)
    public int pop() {
        return stk[--ptr];
    }

    // 스택에서 데이터를 피크(정상에 있는 데이터를 들여다봄)
    public int peek() {
        return stk[ptr - 1];
    }

    // 스택에서 x를 찾아 인덱스(없으면 –1)를 반환
    public int indexOf(int x) {
        for (int i = ptr - 1; i >= 0; i--)				// 정상 쪽에서 선형 검색
            if (stk[i] == x)
                return i;								// 검색 성공
        return -1;										// 검색 실패
    }

    // 스택을 비움
    public void clear() {
        ptr = 0;
    }

    // 스택에 쌓여 있는 데이터 수를 반환
    public int size() {
        return ptr;
    }


    // 스택 안의 모든 데이터를 바닥 → 꼭대기 순서로 출력
    public void dump() {
        if (ptr > 0) {
            for (int i = 0; i < ptr; i++)
                System.out.print(stk[i] + " ");
            System.out.println();
        }
    }

    public static void main(String[] args) {
        P1 p1 = new P1(4);
        p1.push(1);
        p1.push(2);
        p1.push(3);
        p1.push(4);
        System.out.println("pop = " + p1.pop());
        System.out.println("index = " + p1.indexOf(3));
        System.out.println("size = " +p1.size());
        System.out.println("peek = " +p1.peek());
//        p1.clear();
//        p1.push(3);
//        System.out.println(p1.capacity());
//        System.out.println(p1.isFull());
//        System.out.println(p1.isEmpty());
//        System.out.println(p1.indexOf(1));
        p1.dump();
    }
}

/*
    ※ 교재 풀이
    private int ptr;			// 스택 포인터
    private int[] stk;			// 스택 본체

    // 생성자
    public P1(int capacity) {
        ptr = 0;
        stk = new int[capacity];				// 스택 본체용 배열을  생성
    }

    // 스택에 x를 푸시
    public int push(int x) {
        return stk[ptr++] = x;
    }

    // 스택에서 데이터를 팝(정상에 있는 데이터를 꺼냄)
    public int pop() {
        return stk[--ptr];
    }

    // 스택에서 데이터를 피크(정상에 있는 데이터를 들여다봄)
    public int peek() {
        return stk[ptr - 1];
    }

    // 스택에서 x를 찾아 인덱스(없으면 –1)를 반환
    public int indexOf(int x) {
        for (int i = ptr - 1; i >= 0; i--)				// 정상 쪽에서 선형 검색
            if (stk[i] == x)
                return i;								// 검색 성공
        return -1;										// 검색 실패
    }

    // 스택을 비움
    public void clear() {
        ptr = 0;
    }

    // 스택에 쌓여 있는 데이터 수를 반환
    public int size() {
        return ptr;
    }


    // 스택 안의 모든 데이터를 바닥 → 꼭대기 순서로 출력
    public void dump() {
        if (ptr > 0) {
            for (int i = 0; i < ptr; i++)
                System.out.print(stk[i] + " ");
            System.out.println();
        }
    }

    public static void main(String[] args) {
        P1 p1 = new P1(4);
        p1.push(1);
        p1.push(2);
        p1.push(3);
        p1.push(4);
        System.out.println("pop = " + p1.pop());
//        System.out.println("index = " + p1.indexOf(4));
        System.out.println("size = " +p1.size());
        System.out.println("peek = " +p1.peek());
        for (int a : p1.stk) {
            System.out.println(a);
        }
//        p1.clear();
//        p1.push(3);
//        System.out.println(p1.capacity());
//        System.out.println(p1.isFull());
//        System.out.println(p1.isEmpty());
//        System.out.println(p1.indexOf(1));
        p1.dump();
    }

    ※ 내 풀이
    private int stackArray[];
    private int pointer;

    public P1(int counter) {
        pointer = 0;
        stackArray = new int[counter];
    }

    public void push(int x) {
        stackArray[pointer++] = x;
    }

    public void pop() {
        --pointer;
    }

    public void total() {
        for (int i = 0; i < pointer; i++) {
            System.out.print(stackArray[i] + " ");
        }
    }

    public static void main(String[] args) {
        P1 p1 = new P1(4);
        p1.push(1);
        p1.push(2);
        p1.push(3);
        p1.pop();
//        p1.push(4);
        p1.total();
    }
 */
