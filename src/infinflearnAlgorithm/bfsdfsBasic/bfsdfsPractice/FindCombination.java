package infinflearnAlgorithm.bfsdfsBasic.bfsdfsPractice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FindCombination {
    static int[] answer;
    static int n, m;

    public void solution(int level, int val) {
        if(level == m) {
            for (int num : answer) {
                System.out.print(num + " ");
            }
            System.out.println();
        } else {
            for (int i = val; i <= n; i++) {
                answer[level] = i;
                solution(level + 1, i + 1);
            }
        }
    }

    public static void main(String[] args) throws IOException {
        FindCombination fc = new FindCombination();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().split(" ");
        n = Integer.parseInt(s[0]);
        m = Integer.parseInt(s[1]);

        answer = new int[m];
        fc.solution(0, 1);
    }
}
