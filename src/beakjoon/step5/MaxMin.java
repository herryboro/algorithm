package beakjoon.step5;

import java.util.Scanner;

public class MaxMin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String[] s = sc.nextLine().split(" ");
        int min = Integer.parseInt(s[0]);
        int max = Integer.parseInt(s[0]);

        for (int i = 0; i < n; i++) {
            if (Integer.parseInt(s[i]) < min) {
                min = Integer.parseInt(s[i]);
            }
            if (Integer.parseInt(s[i]) > max) {
                max = Integer.parseInt(s[i]);
            }
        }
        System.out.println(min + " " + max);
    }
}
