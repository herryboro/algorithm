package beakjoon.step5;

import java.util.Scanner;

public class OverAverage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        sc.nextLine();
        String[] testCase = new String[count];
        for (int i = 0; i < count; i++) {
            testCase[i] = sc.nextLine();
        }
        sc.close();
        double sum = 0;
        int denominator = 0;

        for (int i = 0; i < count; i++) {
            String[] s = testCase[i].split(" ");
            denominator = Integer.parseInt(s[0]);
            for (int j = 1; j <= denominator; j++) {
                sum += Double.parseDouble(s[j]);
            }
            double aver = sum / denominator;
            double cnt = 0;
            for (int k = 1; k <= denominator; k++) {
                if (Double.parseDouble(s[k]) > aver) {
                    cnt++;
                }
            }
            System.out.printf("%.3f%%\n", (cnt/denominator)*100);
            sum = 0;
        }

    }
}
