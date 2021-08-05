package theory.practice.chapter2;

import java.util.Scanner;

public class Q2 {
    static void sumOf(int[] a) {
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum += a[i];
        }
        System.out.println("배열 int[] a의 모든 요소의 합: " + sum);
    }

    public static void main(String[] args) {
        int temp = 0;
        int[] a = new int[] {5, 10, 73, 2, -5, 42};

        for (int i = 0; i < a.length / 2; i++) {
            System.out.println("a[" + i + "]과 a[" + (a.length - (i+1)) + "]를 교환합니다.");
            temp = a[i];
            a[i] = a[a.length - (i+1)];
            a[a.length  - (i+1)] = temp;

            for (int j = 0; j < a.length; j++) {
                System.out.print(a[j] + " ");
            }
            System.out.println();
        }

        sumOf(a);
    }
}
