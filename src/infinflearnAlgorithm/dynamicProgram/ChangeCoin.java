package infinflearnAlgorithm.dynamicProgram;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;

public class ChangeCoin {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        Integer[] coins = new Integer[n];
        String[] s = br.readLine().split(" ");

        for (int i = 0; i < s.length; i++) {
            coins[i] = Integer.parseInt(s[i]);
        }
        // coins배열 내림차순 정렬
        Arrays.sort(coins, Collections.reverseOrder());

        int m = Integer.parseInt(br.readLine());

        int index = 0;
        int cnt = 0;
        int value = 0;

        while (value != m) {
            if(value > m) {
                // 12
                value = value - coins[index];
                // 1
                index++;
                // 3
                cnt--;
            }
            value += coins[index];
            cnt++;
        }

        System.out.println(cnt);
    }
}
