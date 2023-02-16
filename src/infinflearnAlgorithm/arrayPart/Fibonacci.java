package infinflearnAlgorithm.arrayPart;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Fibonacci {
    public void fi(int n) {
        int num = 1;
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            if(i == 0 || i == 1) {
                arr[0] = 1;
                arr[1] = 1;
            } else {
                arr[i] = arr[i - 2] + arr[i - 1];
            }
        }

        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
    public static void main(String[] args) throws IOException {
        Fibonacci fibonacci = new Fibonacci();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        fibonacci.fi(n);
    }
}
