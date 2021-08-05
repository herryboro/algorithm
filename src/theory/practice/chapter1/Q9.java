package theory.practice.chapter1;

import java.util.Scanner;

public class Q9 {
    static int sumOf(int num1, int num2) {
        int result = 0;
        if(num1 < num2) {
            result = (((num2 - num1) + 1) * (num1 + num2)) / 2;
        } else {
            result = (((num1 - num2) + 1) * (num1 + num2)) / 2;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        System.out.println(sumOf(num1, num2));
    }
}
