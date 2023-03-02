package infinflearnAlgorithm.arrayPart;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Peak {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int answer = 0;
        int n = Integer.parseInt(br.readLine());

        int[][] arr = new int[n+2][n+2];

        for (int i = 1; i <= n; i++) {
            String[] s = br.readLine().split(" ");

            for (int j = 1; j <= n; j++) {
                arr[i][j] = Integer.parseInt(s[j - 1]);
            }
        }

        for (int i = 1; i < n + 1; i++) {
            for (int j = 0; j < n + 1; j++) {
                if (arr[i][j] > arr[i - 1][j] && arr[i][j] > arr[i + 1][j] && arr[i][j] > arr[i][j - 1] && arr[i][j] > arr[i][j + 1]) {
                    answer++;
                }
            }
        }
        System.out.println(answer);
    }
}
