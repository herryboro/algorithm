package beakjoon.step5;

import java.util.Arrays;
import java.util.Scanner;

public class SejunAverage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        sc.nextLine();
        double num = 0;

        String[] score = sc.nextLine().split(" ");
        sc.close();
        Double[] array = new Double[count];

        for (int i = 0; i < count; i++) {
            array[i] = Double.parseDouble(score[i]);
        }

        Arrays.sort(array);
        double max = array[count - 1];

        for (int i = 0; i < count; i++) {
            array[i] = (array[i] / max) * 100;
        }

        for (Double n : array) {
            num += n;
        }
        System.out.println(num / count);
    }
}











