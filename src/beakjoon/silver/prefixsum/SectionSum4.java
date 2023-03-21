package beakjoon.silver.prefixsum;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SectionSum4 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().split(" ");

        int n = Integer.parseInt(s[0]);
        int m = Integer.parseInt(s[1]);

        String[] s1 = br.readLine().split(" ");
        // 주어진 숫자 배열
        int[] num = new int[n + 1];
        // 누적합 처리를 위한 index 배열
        int[] index = new int[n + 1];

        for (int i = 1; i <= n; i++) {
            num[i] = Integer.parseInt(s1[i - 1]);
            index[i] = num[i] + index[i - 1];
        }


        // m값 만큼 출력해야되는 범위 입력
        for (int i = 1; i <= m; i++) {
            String[] s2 = br.readLine().split(" ");
            int frontNum = Integer.parseInt(s2[0]);
            int backNum = Integer.parseInt(s2[1]);

            System.out.println(index[backNum] - index[frontNum - 1]);
        }
    }
}
