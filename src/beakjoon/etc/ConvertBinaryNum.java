package beakjoon.etc;

import java.util.Scanner;

public class ConvertBinaryNum {
    public void solution(int decNum) {
        if (decNum == 0) return;
        solution(decNum / 2);
        System.out.print(decNum % 2);
    }

    public static void main(String[] args) {
        ConvertBinaryNum num = new ConvertBinaryNum();
        Scanner sc = new Scanner(System.in);
        int decNum = sc.nextInt();
        num.solution(decNum);
    }
}
