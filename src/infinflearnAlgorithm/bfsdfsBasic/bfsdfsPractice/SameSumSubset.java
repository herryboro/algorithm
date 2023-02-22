package infinflearnAlgorithm.bfsdfsBasic.bfsdfsPractice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SameSumSubset {
    static String answer = "NO";
    static int n, tot = 0;
    static boolean haveYes = false;

    public String solution(int index, int sum, int[] arr) {
        if(haveYes) return answer;
        if((tot/2) < sum) return answer;

        if(index == n) {
            if(tot - sum == sum) {
                haveYes = true;
                return answer = "YES";
            }
        } else {
            solution(index + 1, sum + arr[index], arr);
            solution(index + 1, sum, arr);
        }
        return answer;
    }

    public static void main(String[] args) throws IOException {
        SameSumSubset subset = new SameSumSubset();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());

        // 주어진 n개의 부분집합
        String[] s = br.readLine().split(" ");
        int[] arr = new int[n];
        for (int i = 0; i < s.length; i++) {
            arr[i] = Integer.parseInt(s[i]);
        }
        // 배열의 총합
        for (int sumArr : arr) {
            tot += sumArr;
        }
        // 부분합
        int sum = 0;

        System.out.println(subset.solution(0, 0, arr));
    }
}
