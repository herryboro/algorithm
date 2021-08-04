package beakjoon.step2;

import java.util.Scanner;

public class Quarterspace {
    public static void main(String[] args) {
        Scanner var = new Scanner(System.in);
        int firstNum = var.nextInt();
        int secondNum = var.nextInt();
        var.close();

        if(firstNum > 0 && secondNum > 0) {
            System.out.println("1");
        } else if(firstNum < 0 && secondNum > 0) {
            System.out.println("2");
        } else if(firstNum < 0 && secondNum < 0) {
            System.out.println("3");
        } else if(firstNum > 0 && secondNum < 0) {
            System.out.println("4");
        }
    }
}
