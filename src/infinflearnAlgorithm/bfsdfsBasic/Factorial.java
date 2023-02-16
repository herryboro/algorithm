package infinflearnAlgorithm.bfsdfsBasic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Factorial {
    public int fac(int n) {
        if(n == 1) {
            return 1;
        } else return n * fac(n-1);
    }
    public static void main(String[] args) throws IOException {
        Factorial factorial = new Factorial();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        System.out.println(factorial.fac(n));
    }
}
