package programmers.level3.hash;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class UndestroyedBuilding {
    static int[][] sum;
    static int N, M;

    private static void operate() {
        // 상하
        for (int y = 1; y < N; y++) {
            for (int x = 0; x < M; x++) {
                sum[y][x] += sum[y - 1][x];
            }
        }
        // 좌우
        for (int x = 1; x < M; x++) {
            for (int y = 0; y < N; y++) {
                sum[y][x] += sum[y][x - 1];
            }
        }
    }
    public static int solution(int[][] board, int[][] skill) {
        N = board.length;
        M = board[0].length;

        sum = new int[N + 1][M + 1];
        for (int[] s : skill) {
            int y1 = s[1], x1 = s[2];
            int y2 = s[3], x2 = s[4];
            int degree = s[5] * (s[0] == 1 ? -1 : 1);

            sum[y1][x1] += degree;
            sum[y1][x2 + 1] += (degree * -1);
            sum[y2 + 1][x1] += (degree * -1);
            sum[y2 + 1][x2 + 1] += degree;
        }
        operate();

        // 살아남은 건물 확인
        int answer = 0;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if (board[i][j] + sum[i][j] > 0) answer++;
            }
        }
        return answer;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int m = Integer.parseInt(br.readLine());

        int[][] board = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                board[i][j] = 5;
            }
        }

//        for (int i = 0; i < board.length; i++) {
//            for (int j = 0; j < board[i].length; j++) {
//                System.out.print(board[i][j] + " ");
//            }
//            System.out.println();
//        }

        int[][] skill = {{1,0,0,3,4,4},{1,2,0,2,3,2},{2,1,0,3,1,2},{1,0,1,3,3,1}};

        UndestroyedBuilding ub = new UndestroyedBuilding();
        System.out.println(ub.solution(board, skill));


    }
}
