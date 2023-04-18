package infinflearnAlgorithm.stringimplement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ShortestDistance {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().split(" ");
        String s = str[0];
        String t = str[1];

        int[] answer = new int[s.length()];
        int distance = Integer.MAX_VALUE;

        // 왼쪽부터 answer배열 채우기
        for (int i = 0; i < s.length(); i++) {
            if (s.substring(i, i + 1).equals(t)) {
                answer[i] = 0;
                distance = 0;
            } else {
                distance++;
                answer[i] = distance;
            }
        }
        distance = 0;

        // 반대로 진행
        for (int i = s.length() - 1; i >= 0; i--) {
            if (!s.substring(i, i + 1).equals(t)) {
                distance++;
                if (answer[i] > distance) {
                    answer[i] = distance;
                }
            } else {
                distance = 0;
                answer[i] = distance;
            }
        }

        for (int n : answer) {
            System.out.print(n + " ");
        }
    }
}
