package beakjoon.step1;

import java.util.Scanner;

public class multiplication {
    public static void main(String[] args) {
        Scanner var = new Scanner(System.in);

        int firstNum = var.nextInt();
        int secondNum = var.nextInt();

        String num = Integer.toString(secondNum);

        int i1 = Integer.parseInt(num.substring(0, 1));
        int i2 = Integer.parseInt(num.substring(1, 2));
        int i3 = Integer.parseInt(num.substring(2, 3));

        int answer3 = firstNum * i3;
        int answer4 = firstNum * i2;
        int answer5 = firstNum * i1;
        int answer6 = firstNum * secondNum;

        System.out.println(answer3);
        System.out.println(answer4);
        System.out.println(answer5);
        System.out.println(answer6);
    }
}
