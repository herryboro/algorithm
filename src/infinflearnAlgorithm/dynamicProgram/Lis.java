package infinflearnAlgorithm.dynamicProgram;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Lis {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int[] answer = new int[n];
        int[] memo = new int[n];
        String[] s = br.readLine().split(" ");

        for (int i = 0; i < n; i++) {
            answer[i] = Integer.parseInt(s[i]);
        }
        memo[0] = 1;

        int value = 0;

        for (int i = 1; i < n; i++) {
            int max = 0;

            for (int j = 0; j < i; j++) {
                if(answer[j] < answer[i] && memo[j] > max) {
                    max = memo[j];
                }
                memo[i] = max + 1;
                value = Math.max(value, memo[i]);
            }
        }

        System.out.println(value);
    }
}
