package beakjoon.etc;

import java.io.IOException;
import java.util.Scanner;

public class RecursiveFunction {
    public void solution(int cnt) {
        if (cnt <= 0) return;
        solution(cnt - 1);
        System.out.print(cnt + " ");
    }

    public static void main(String[] args) throws IOException {
        RecursiveFunction main = new RecursiveFunction();
        Scanner sc = new Scanner(System.in);
        int val = sc.nextInt();
        main.solution(val);
    }
}
