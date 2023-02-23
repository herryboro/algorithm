package infinflearnAlgorithm.bfsdfsBasic.bfsdfsPractice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DuplePermutation {
    static int[] arr;
    static int n, m;
    public void solution(int nv) {
        if(nv == m) {
            for (int num : arr) {
                System.out.print(num + " ");
            }
            System.out.println();
        } else {
            for (int i = 1; i <= n; i++) {
                arr[nv] = i;
                solution(nv + 1);
            }
        }
    }
    public static void main(String[] args) throws IOException {
        DuplePermutation duplePermutation = new DuplePermutation();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().split(" ");

        // 1 ~ n번 구슬 번호
        n = Integer.parseInt(s[0]);
        // 뽑을 구슬 개수
        m = Integer.parseInt(s[1]);

        arr = new int[m];

        duplePermutation.solution(0);
    }
}
