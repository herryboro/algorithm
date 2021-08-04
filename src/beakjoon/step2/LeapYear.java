package beakjoon.step2;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner var = new Scanner(System.in);
        int year = var.nextInt();
        var.close();

        if(year % 4 == 0 && year % 100 != 0) {
            System.out.println("1");
        } else if (year % 4 == 0 && year % 400 == 0) {
            System.out.println("1");
        } else {
            System.out.println("0");
        }
    }
}
