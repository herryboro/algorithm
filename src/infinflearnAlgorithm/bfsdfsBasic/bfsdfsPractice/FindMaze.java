package infinflearnAlgorithm.bfsdfsBasic.bfsdfsPractice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FindMaze {
    static int[][] board;
    static int answer = 0;
    int[] x = {-1, 0, 1, 0};
    int[] y = {0, 1, 0, -1};


    public void solution(int dx, int dy) {
        if(dx == 6 && dy == 6) {
            answer++;
        } else {
            for (int i = 0; i < 4; i++) {
                int nx = dx + x[i];
                int ny = dy + y[i];

                if (nx >= 0 && nx < 7 && ny >= 0 && ny < 7  && board[nx][ny] == 0) {
                    board[nx][ny] = 1;
                    solution(nx, ny);
                    board[nx][ny] = 0;
                }
            }
        }
    }

    public static void main(String[] args) throws IOException {
        FindMaze findMaze = new FindMaze();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        board = new int[7][7];

        for (int i = 0; i < 7; i++) {
            String[] s = br.readLine().split(" ");

            for (int j = 0; j < 7; j++) {
                board[i][j] = Integer.parseInt(s[j]);
            }
        }
        board[0][0] = 1;
        findMaze.solution(0, 0);
        System.out.println(answer);
    }
}
