package beakjoon.step3;

import java.util.Scanner;

public class SumFormula {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int cnt = 0;

        for (int i = 0; i < num; i++) {
           cnt += i + 1;
        }
        System.out.println(cnt);
    }
}
