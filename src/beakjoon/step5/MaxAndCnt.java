package beakjoon.step5;

import java.util.Arrays;
import java.util.Scanner;

public class MaxAndCnt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Integer[] numArray = new Integer[9];
        int max = 0;

        for (int i = 0; i < 9; i++) {
            int num = sc.nextInt();
            numArray[i] = num;
        }

        for (Integer num : numArray) {
            if(max  < num) {
                max = num;
            }
        }
        int cnt = Arrays.asList(numArray).indexOf(max);
        System.out.println(max);
        System.out.println(cnt + 1);
    }
}
