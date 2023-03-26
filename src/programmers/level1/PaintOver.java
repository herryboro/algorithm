package programmers.level1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 프로그래머스 1단계 덧칠하기
public class PaintOver {
    public int solution(int n, int m, int[] section) {
        int answer = 0;
        int maxLeng = 0;

        for (int i = 0; i < section.length; i++) {
            if (section[i] < maxLeng) {
                continue;
            }

            answer++;
            maxLeng = section[i] + m;
        }

        return answer;
    }
    public static void main(String[] args) throws IOException {
        PaintOver paintOver = new PaintOver();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int m = Integer.parseInt(br.readLine());

        String[] s = br.readLine().split(" ");
        int[] section = new int[s.length];
        for (int i = 0; i < s.length; i++) {
            section[i] = Integer.parseInt(s[i]);
        }
        // 8 | 4 | 2 3 6
        System.out.println(paintOver.solution(n, m, section));
    }
}
