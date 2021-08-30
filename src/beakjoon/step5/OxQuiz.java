package beakjoon.step5;

import java.util.Scanner;

public class OxQuiz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        sc.nextLine();
        String[] quiz = new String[count];
        int[] sumArray = new int[count];
        int sum = 1;
        int sumAccum = 0;

        for (int i = 0; i < count; i++) {
            quiz[i] = sc.next();
        }
        for (int i = 0; i < count; i++) {
            for (int j = 0; j < quiz[i].length(); j++) {
                String substring = quiz[i].substring(j, j + 1);
                if (substring.equalsIgnoreCase("o")) {
                    sumAccum += sum++;
                } else {
                    sum = 1;
                }
                if (j == quiz[i].length() - 1) {
                    sumArray[i] = sumAccum;
                    sum = 1;
                    sumAccum = 0;
                    break;
                }
            }
        }

        for (int a : sumArray) {
            System.out.println(a);
        }
    }
}
