package beakjoon.step4;

import java.util.Scanner;

public class APlusB_While2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while(sc.hasNextInt()){
            int num1 = sc.nextInt();
            int num2 = sc.nextInt();
            System.out.println(num1 + num2);
        }
        sc.close();
    }
}

