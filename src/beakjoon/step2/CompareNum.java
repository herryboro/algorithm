package beakjoon.step2;

import java.util.Scanner;

public class CompareNum {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        String strNum = num.nextLine();

        String[] numArray = strNum.split(" ");

        int num1 = Integer.parseInt(numArray[0]);
        int num2 = Integer.parseInt(numArray[1]);

        if(num1 > num2) {
            System.out.println(">");
        } else if(num1 < num2) {
            System.out.println("<");
        } else {
            System.out.println("==");
        }
    }
}
