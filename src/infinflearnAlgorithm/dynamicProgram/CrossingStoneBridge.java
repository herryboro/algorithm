package infinflearnAlgorithm.dynamicProgram;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CrossingStoneBridge {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        // dp
        int[] memo = new int[n + 2];
        memo[1] = 1;
        memo[2] = 2;

        for (int i = 3; i < n + 2; i++) {
            memo[i] = memo[i-1] + memo[i-2];
        }

        System.out.println(memo[memo.length-1]);
    }
}
