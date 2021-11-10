package beakjoon.etc;

import java.util.Scanner;

public class Fibonacci {

    public void solution(int decNum) {
//        int num1 = 0
    }

    public static void main(String[] args) {
        Fibonacci fibonacci = new Fibonacci();
        Scanner sc = new Scanner(System.in);
        int decNum = sc.nextInt();
        fibonacci.solution(decNum);
    }
}



/*
import java.util.Scanner;

public class Fibonacci {
    static int[] fibo;

    public int solution(int decNum) {
        if (fibo[decNum] > 0) {
            return fibo[decNum];
        }
        if(decNum == 1) return fibo[decNum] = 1;
        else if(decNum == 2) return fibo[decNum] = 1;
        else return fibo[decNum] = solution(decNum - 1) + solution(decNum - 2);
    }

    public static void main(String[] args) {
        Fibonacci fibonacci = new Fibonacci();
        Scanner sc = new Scanner(System.in);
        int decNum = sc.nextInt();
        fibo = new int[decNum + 1];
        System.out.println(fibonacci.solution(decNum));

        for (int i = 1; i < decNum + 1; i++) {
            System.out.print(fibo[i] + " ");
        }
    }
}
 */

