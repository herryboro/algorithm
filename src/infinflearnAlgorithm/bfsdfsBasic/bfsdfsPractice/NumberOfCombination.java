package infinflearnAlgorithm.bfsdfsBasic.bfsdfsPractice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NumberOfCombination {
    static int n, r;
    public int solution(int nVal, int rVal, int[][] memo) {
        int sum = 0;

        if(nVal == rVal || rVal == 0) {
            memo[nVal][rVal] = 1;
            return 1;
        } else {
            if (memo[nVal][rVal] == 0) {
                sum += solution(nVal - 1, rVal - 1, memo);
                sum += solution(nVal - 1, rVal, memo);
            }
        }
        return sum;
    }

    public static void main(String[] args) throws IOException {
        NumberOfCombination noc = new NumberOfCombination();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().split(" ");
        n = Integer.parseInt(s[0]);
        r = Integer.parseInt(s[1]);
        int sum = 0;

        int[][] memo = new int[n + 1][r + 1];

        System.out.println(noc.solution(n, r, memo));
    }
}
