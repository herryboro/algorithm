package infinflearnAlgorithm.bfsdfsBasic.bfsdfsPractice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public class ChangeCoin {
    /**
     *  내코드 (시간 에러)
     */
    static int[] coinArr;
    static int n, m;
    static int answer = 501;
    public void solution(int index, int sumChange) {
        if(sumChange > m) return;

        if(sumChange == m) {
            answer = Math.min(answer, index) ;
        } else {
            for (int i = 0; i < n; i++) {
                solution(index + 1, sumChange + coinArr[i]);
            }
        }
    }

    public static void main(String[] args) throws IOException {
        ChangeCoin coin = new ChangeCoin();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // 동전 개수 n
        n = Integer.parseInt(br.readLine());

        // 동전 종류
        String[] s = br.readLine().split(" ");
        coinArr = new int[n];
        for (int i = 0; i < n; i++) {
            coinArr[i] = Integer.parseInt(s[i]);
        }

        // 거슬러줄 금액
        m = Integer.parseInt(br.readLine());
        coin.solution(0,0);
        System.out.println(answer);
    }

    /**
     *  강사 코드
     */
//    static int n, m, answer = Integer.MAX_VALUE;
//
//    public void solution(int L, int sum, int[] arr) {
//        if(sum > m) return;
//
//        if (sum == m) {
//            answer = Math.min(answer, L);
//        } else {
//            for (int i = 0; i < n; i++) {
//                solution(L+1, sum + arr[i], arr);
//            }
//        }
//    }
//
//    public static void main(String[] args) throws IOException {
//        ChangeCoin coin = new ChangeCoin();
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        // 동전 개수 n
//        n = Integer.parseInt(br.readLine());
//
//        // 동전 종류
//        String[] s = br.readLine().split(" ");
//        int[] arr = new int[n];
//        for (int i = 0; i < n; i++) {
//            arr[i] = Integer.parseInt(s[i]);
//        }
//
//        // 거슬러줄 금액
//        m = Integer.parseInt(br.readLine());
//        coin.solution(0,0, arr);
//        System.out.println(answer);
//    }

    /**
     *  chat gpt
     */
//    static int [] coins;
//    private static int dfs(int m, int sum, int[] memo) {
//        if (sum == m) {
//            return 0;
//        }
//
//        if (memo[sum] != -1) {
//            return memo[sum];
//        }
//
//        int answer = Integer.MAX_VALUE;
//
//        for (int i = 0; i < coins.length; i++) {
//            // 누적 동점 합이 m보다 작으면 재귀
//            if (sum + coins[i] <= m) {
//                int subAns = dfs(m, sum + coins[i], memo);
//
//                if (subAns != -1) {
//                    answer = Math.min(answer, subAns + 1);
//                }
//            }
//        }
//
//        if (answer == Integer.MAX_VALUE) {
//            memo[sum] = -1;
//        } else {
//            memo[sum] = answer;
//        }
//        return memo[sum];
//    }
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        coins = new int[n];
//        for (int i = 0; i < n; i++) {
//            coins[i] = sc.nextInt();
//        }
//        int m = sc.nextInt();
//        int[] memo = new int[m + 1];
//        Arrays.fill(memo, -1);
//
//        int ans = dfs(m, 0, memo);
//        System.out.println(ans);
//    }
}
