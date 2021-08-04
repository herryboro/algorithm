package beakjoon.step3;

import java.util.Scanner;

public class Gugudan {
    public static void main(String[] args) {
        Scanner var = new Scanner(System.in);
        int dan = var.nextInt();
        var.close();

        for (int i = 0; i < 9; i++) {
            System.out.println(dan + " * " + (i + 1) + " = " + dan  * (i + 1));
        }
    }
}
