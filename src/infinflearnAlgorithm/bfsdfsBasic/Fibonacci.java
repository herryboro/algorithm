package infinflearnAlgorithm.bfsdfsBasic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Fibonacci {
    static int[] arr;

    public int answer(int n) {
        if(arr[n] > 0) {
            return arr[n];
        }

        if(n == 1) return arr[n] = 1;
        else if(n == 2) return arr[n] = 1;
        else {
           return arr[n] = answer(n - 2) + answer(n - 1);
        }
    }

    public static void main(String[] args) throws IOException {
        Fibonacci fibonacci = new Fibonacci();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        arr = new int[n + 1];
        fibonacci.answer(n);

        for (int i = 1; i <= n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
