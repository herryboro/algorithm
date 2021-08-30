package beakjoon.step6;

import java.util.Scanner;

public class SunOfN {
    static long sum(int [] a) {
        int sum = 0;
        for (int num : a) {
            sum += num;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int numArray[] = new int[num];

        for (int i = 0; i < num; i++) {
            numArray[i] = sc.nextInt();
        }
        System.out.println(sum(numArray));
    }
}
