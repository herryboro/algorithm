package infinflearnAlgorithm.bfsdfsBasic.bfsdfsPractice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CombinationUseMemo {
    public int solution(int num) {
        int answer = 0;
        int denominator = 0;
        int numerator = 0;

        if(num == 1) {
            return 1;
        } else {
            answer = num * solution(num - 1);
        }
        return answer;
    }
    public static void main(String[] args) throws IOException {
        CombinationUseMemo combinationUseMemo = new CombinationUseMemo();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().split(" ");
        int n = Integer.parseInt(s[0]);
        int r = Integer.parseInt(s[1]);

//        combinationUseMemo.solution(n, r);
    }
}
