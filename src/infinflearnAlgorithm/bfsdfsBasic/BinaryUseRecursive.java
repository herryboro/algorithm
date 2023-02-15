package infinflearnAlgorithm.bfsdfsBasic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BinaryUseRecursive {
    public void binary(int n) {
        if(n == 1) {
            System.out.print(1 + " ");
            return;
        } else {
            binary(n/2);
        }
        System.out.print(n % 2 + " ");
    }
    public static void main(String[] args) throws IOException {
        BinaryUseRecursive recursive = new BinaryUseRecursive();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        recursive.binary(n);
    }
}
