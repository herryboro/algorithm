package infinflearnAlgorithm.bfsdfsBasic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AdjoinMatrix {
    static int n, m, answer = 0;
    static int[][] graph;
    static int[] ch;
    public void DFS(int v) {
        if(v == n) answer++;
        else {
            for(int i = 1; i <= n; i++) {
                if(graph[v][i] == 1 && ch[i] == 0) {
                    ch[i] = 1;
                    DFS(i);
                    ch[i] = 0;
                }
            }
        }
    }
    public static void main(String[] args) {
        AdjoinMatrix matrix = new AdjoinMatrix();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try {
            String[] nm = br.readLine().split(" ");
            n = Integer.parseInt(nm[0]);
            m = Integer.parseInt(nm[1]);

            // n = 5, m = 9
            graph = new int[n + 1][n + 1];
            ch = new int[n + 1];

            for (int i = 0; i < m; i++) {
                int a = Integer.parseInt(br.readLine());
                int b = Integer.parseInt(br.readLine());
                graph[a][b] = 1;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        ch[1] = 1;
        matrix.DFS(1);
        System.out.println(answer);
    }
}
