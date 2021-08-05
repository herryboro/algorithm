package theory.practice.chapter1;

import java.util.Scanner;

public class Q8 {
    static int sum(int num) {
        return ((1 + num) * num)/ 2;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        System.out.println(sum(num));
    }
}
