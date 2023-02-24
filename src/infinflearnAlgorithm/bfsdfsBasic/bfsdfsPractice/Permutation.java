package infinflearnAlgorithm.bfsdfsBasic.bfsdfsPractice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Permutation {
    static int[] arr;
    static int[] ch, sout;
    static int n, m;
    public void solution(int index) {
        if(index > m) {
            for (int i = 1; i <= m; i++) {
                System.out.print(sout[i] + " ");
            }
            System.out.println();
        } else {
            for (int i = 1; i <= n; i++) {
                if(ch[i] == 0) {
                    ch[i] = 1;
                    sout[index] = arr[i];
                    solution(index + 1);
                    ch[i] = 0;
                }
            }
        }
    }
    public static void main(String[] args) throws IOException {
        Permutation p = new Permutation();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().split(" ");
        // n, m
        n = Integer.parseInt(s[0]);
        m = Integer.parseInt(s[1]);

        // arr
        arr = new int[n + 1];
        ch = new int[n + 1];
        sout = new int[m + 1];

        String[] s1 = br.readLine().split(" ");
        for (int i = 1; i <= n; i++) {
            arr[i] = Integer.parseInt(s1[i-1]);
        }

        p.solution(1);
    }
}
