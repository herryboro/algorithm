package beakjoon.step5;

import java.util.Arrays;
import java.util.Scanner;

public class NumberCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numArray = new int[10];
        int[] cnt = {0, 0, 0, 0, 0, 0, 0, 0, 0,0};
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();

        int multiNum = num1 * num2 * num3;
        char[] chars = String.valueOf(multiNum).toCharArray();

        for (int i = 0; i < chars.length; i++) {
            for (int j = 0; j < chars.length; j++) {

            }
            numArray[i] = cnt[i];
        }
    }
}
