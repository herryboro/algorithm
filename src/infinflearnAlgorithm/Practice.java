package infinflearnAlgorithm;

import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number of elements: ");
        int n = scan.nextInt();
        int[] numbers = new int[n];

        System.out.println("Enter the elements: ");
        for (int i = 0; i < n; i++) {
            numbers[i] = scan.nextInt();
        }

        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (numbers[j] < numbers[minIndex]) {
                    minIndex = j;
                }
            }

            int temp = numbers[minIndex];
            numbers[minIndex] = numbers[i];
            numbers[i] = temp;
        }

        System.out.println("Sorted elements: ");
        for (int i = 0; i < n; i++) {
            System.out.print(numbers[i] + " ");
        }
    }

}
