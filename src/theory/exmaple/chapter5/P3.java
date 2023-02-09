package theory.exmaple.chapter5;

import java.util.Scanner;

public class P3 {
    static void recur(int n) {
        if (n > 0) {
            recur(n - 1);
            System.out.println(n);
            recur(n - 2);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("정수를 입력하세요: ");
        int i = sc.nextInt();
        recur(i);
    }
}
