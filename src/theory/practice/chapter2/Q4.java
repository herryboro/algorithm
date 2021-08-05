package theory.practice.chapter2;

import java.util.Scanner;

public class Q4 {
    static void copy(int[] a, int[] b) {
        for (int i = 0; i < b.length; i++) {
            a[i] = b[i];
        }

        for (int i = 0; i < b.length; i++) {
            System.out.println("copy a배열: " + a[i]);
        }
    }

    static void rcopy(int[] a, int[] b) {
        for (int i = 0; i < b.length; i++) {
            a[i] = b[b.length-(i+1)];
        }

        for (int i = 0; i < b.length; i++) {
            System.out.println("rcopy a배열: " + a[i]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arrayLeng = sc.nextInt();
        int[] b = new int[arrayLeng];
        int[] a = new int[arrayLeng];

        for (int i = 0; i < arrayLeng; i++) {
            b[i] = sc.nextInt();
        }
        copy(a, b);
        rcopy(a, b);
    }
}
