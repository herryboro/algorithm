package beakjoon.etc;

import java.util.Scanner;

public class Factorial {
    public int solution(int decNum) {
        if (decNum == 1) return 1;
        else return decNum * solution(decNum - 1);
    }

    public static void main(String[] args) {
        Factorial num = new Factorial();
        Scanner sc = new Scanner(System.in);
        int decNum = sc.nextInt();
        System.out.println(num.solution(decNum));
    }
}
