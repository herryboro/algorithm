package infinflearnAlgorithm.bfsdfsBasic.bfsdfsPractice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MaxScore {
    static int[] scoreArr, timeArr;
    static int n,m, sumTime, sumScore, answer;
    public int solution(int index, int score, int liTime) {
        if(liTime > m) return answer;

        if(index == n) {
            answer = Math.max(answer, score);
        } else {
            solution(index + 1, score + scoreArr[index], liTime + timeArr[index]);
            solution(index + 1, score, liTime);
        }
        return answer;
    }
    public static void main(String[] args) throws IOException {
        MaxScore maxScore = new MaxScore();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().split(" ");
        // 문제의 개수 n
        n = Integer.parseInt(s[0]);
        // 제한 시간 m
        m = Integer.parseInt(s[1]);

        scoreArr = new int[n];
        timeArr = new int[n];

        for (int i = 0; i < n; i++) {
            String[] s1 = br.readLine().split(" ");
            scoreArr[i] = Integer.parseInt(s1[0]);
            timeArr[i] = Integer.parseInt(s1[1]);
        }

        System.out.println(maxScore.solution(0,0, 0));
    }
}
