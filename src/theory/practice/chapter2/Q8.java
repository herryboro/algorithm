package theory.practice.chapter2;

import java.util.Scanner;

public class Q8 {
    static int[][] array = {
            {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31},
            {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31}
    };

    static int leapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) ? 1 : 0;
    }

    static int sumDaysInYear(int year, int month, int days) {
        while (--month != 0) {
            days += array[leapYear(year)][month - 1];
        }
        return days;
    }

    static int leftDayOfYear(int y, int m, int d) {
        int day = 31 - d;
        while (m++ != 12) {
            day += array[leapYear(y)][m - 1];
        }
        return day;
    }

    public static void main(String[] args) {
        System.out.println("그 해 경과 일 수를 구합니다.");
        Scanner sc = new Scanner(System.in);
        System.out.print("년: ");
        int year = sc.nextInt();
        System.out.print("월: ");
        int month = sc.nextInt();
        System.out.print("일: ");
        int days = sc.nextInt();

        System.out.printf("%d일째 입니다.", sumDaysInYear(year, month, days));
        System.out.println();
        System.out.printf("올해 남은 일수는 %d일 입니다.", leftDayOfYear(year, month, days));
    }
}
