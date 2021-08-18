package beakjoon.step5;

import java.util.Scanner;

public class NumberCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 0;
        int[] numArray = new int[10];
        char[] cnt = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();

        sc.close();

        int multiNum = num1 * num2 * num3;
        char[] chars = String.valueOf(multiNum).toCharArray();

        for (int i = 0; i < cnt.length; i++) {
            for (int j = 0; j < chars.length; j++) {
                if(cnt[i] == chars[j]) {
                    count++;
                }
            }
            numArray[i] = count;
            count = 0;
        }

        for (int num : numArray) {
            System.out.println(num);
        }
    }
}
