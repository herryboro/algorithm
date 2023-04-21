package infinflearnAlgorithm.arrayPart;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CountScore {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int[] score = new int[n];
        String[] s = br.readLine().split(" ");

        for (int i = 0; i < score.length; i++) {
            score[i] = Integer.parseInt(s[i]);
        }

        boolean flag = false;
        int cumScore = 0;
        int sum = 0;

        for (int i : score) {
            if(i == 1) {
                flag = true;
                cumScore++;
            } else {
                flag = false;
                cumScore = 0;
            }
            sum += cumScore;
        }
        System.out.println(sum);
    }
}
