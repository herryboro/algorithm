package infinflearnAlgorithm.bfsdfsBasic.bfsdfsPractice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

class Node {
    int x;
    int y;

    public Node(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

public class FindMazeShortest {
    static int[][] board, dis;
    static int[] x = {-1, 0, 1, 0};
    static int[] y = {0, 1, 0, -1};

    public void solution(int xVal, int yVal) {
        Queue<Node> queue = new LinkedList<>();
        queue.offer(new Node(xVal, yVal));

        while (!queue.isEmpty()) {
            Node poll = queue.poll();
            // poll.x = 5, poll .y = 5

            for (int i = 0; i < 4; i++) {
                int dx = poll.x + x[i];
                int dy = poll.y + y[i];
                // dx = 5, dy = 6

                if (dx >= 1 && dx <= 7 && dy >= 1 && dy <= 7 && board[dx][dy] == 0) {
                    board[dx][dy] = 1;
                    queue.offer(new Node(dx, dy));
                    dis[dx][dy] = dis[poll.x][poll.y] + 1;
                }
            }
        }
    }

    public static void main(String[] args) throws IOException {
        FindMazeShortest maze = new FindMazeShortest();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        board = new int[8][8];
        dis = new int[8][8];
        // board 미로값 입력
        for (int i = 1; i <= 7 ; i++) {
            String[] s = br.readLine().split(" ");
            for (int j = 1; j <= 7 ; j++) {
                board[i][j] = Integer.parseInt(s[j-1]);
            }
        }
        // 미로 board[1][1] 초기값 설정 1
        board[1][1] = 1;
        maze.solution(1,1);
        // 정답 출력
        if(dis[7][7] == 0) System.out.println(-1);
        else System.out.println(dis[7][7]);

        for (int i = 1; i <= 7 ; i++) {
            for (int j = 1; j <= 7 ; j++) {
                System.out.print(dis[i][j] + "  ");
            }
            System.out.println();
        }
    }
}
