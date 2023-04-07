package infinflearnAlgorithm.dynamicProgram;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StairClimb {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        // dp를 위한 메모지제이션
        int[] memo = new int[n+1];
        memo[1] = 1;
        memo[2] = 2;

        for (int i = 3; i < n+1 ; i++) {
            memo[i] = memo[i-1] + memo[i-2];
        }

        System.out.println(memo[n]);
    }
}
