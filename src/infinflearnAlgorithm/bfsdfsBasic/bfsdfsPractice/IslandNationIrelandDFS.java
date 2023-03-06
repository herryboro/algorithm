package infinflearnAlgorithm.bfsdfsBasic.bfsdfsPractice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Island {
    int x;
    int y;

    public Island(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

public class IslandNationIrelandDFS {
    static int n, answer = 0;
    static int board[][];
    static int[] dx = {-1,-1, -1, 0, 1, 1, 1, 0};
    static int[] dy = {-1, 0, 1, 1, 1, 0, -1, -1};
    public void solution(Island island) {
        for (int i = 0; i < 8; i++) {
            int nx = island.x + dx[i];
            int ny = island.y + dy[i];

            if (nx >= 0 && nx < n && ny >= 0 && ny < n && board[nx][ny] == 1) {
                // 지나가면 0
                board[nx][ny] = 0;
                solution(new Island(nx, ny));
            }
        }
    }
    public static void main(String[] args) throws IOException {
        IslandNationIrelandDFS iDfs = new IslandNationIrelandDFS();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        board = new int[n][n];

        // 입력값
        for (int i = 0; i < n; i++) {
            String[] s = br.readLine().split(" ");

            for (int j = 0; j < n; j++) {
                board[i][j] = Integer.parseInt(s[j]);
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(board[i][j] == 1) {
                    answer++;
                    board[i][j] = 0;
                    // 정답
                    iDfs.solution(new Island(i,j));
                }
            }
        }
        System.out.println(answer);
    }
}
