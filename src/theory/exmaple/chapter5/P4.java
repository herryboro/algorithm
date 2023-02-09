package theory.exmaple.chapter5;

import java.util.Scanner;

public class P4 {
    static void recur(int n) {
        while (n > 0) {
            recur(n - 1);
            System.out.println(n);
            n = n - 2;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("정수를 입력하세요: ");
        int i = sc.nextInt();
        recur(i);
    }
}
