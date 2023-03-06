package infinflearnAlgorithm.bfsdfsBasic.bfsdfsPractice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

/**
 *  내풀이
 */
class Tomato {
    int x;
    int y;

    public Tomato(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

public class TomatoBfs {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().split(" ");
        // n, m
        int n = Integer.parseInt(s[1]);
        int m = Integer.parseInt(s[0]);

        // 상하 좌우 좌표 대조
        int[] x = {-1, 0, 1, 0};
        int[] y = {0, 1, 0, -1};

        // storage 창고
        int[][] storage = new int[n][m];

        // 초기 1값의 위치
        Queue<Tomato> queue = new LinkedList<>();

        // 입력시 1로 채워지는 개수, -1로 채워지는 개수,
        int oneCnt = 0;
        int minusOneCnt = 0;

        for (int i = 0; i < n; i++) {
            String[] s1 = br.readLine().split(" ");
            for (int j = 0; j < m; j++) {
                int val = Integer.parseInt(s1[j]);

                // 입력시 값이 1이면 queue에 선입한다.
                if(val == 1) {
                    queue.offer(new Tomato(i, j));
                    oneCnt++;
                } else if(val == -1) {
                    minusOneCnt++;
                }
                storage[i][j] = val;
            }
        }

        // 최소 날짜 (정답값)
        int answer = 0;
        int st = queue.size();
        int cnt = 0;

        // 처음부터 1로 다 채워져 있는 경우는 거른다.
        if (((n * m) - minusOneCnt) != oneCnt) {
            while (!queue.isEmpty()) {
                cnt++;
                if (st == cnt) {
                    st = queue.size();
                    answer++;
                    cnt = 0;
                }

                Tomato pickTomato = queue.poll();

                for (int i = 0; i < 4; i++) {
                    int dx = pickTomato.x + x[i];
                    int dy = pickTomato.y + y[i];

                    if(dx >= 0 && dx <= (n-1) && dy >= 0 && dy <= (m-1) && storage[dx][dy] == 0) {
                        storage[dx][dy] = 1;
                        queue.offer(new Tomato(dx, dy));
                    }
                }
            }
        }

        // 모두 익지 못하는 상황 확인
        boolean flag = false;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if(storage[i][j] == 0) {
                    answer = -1;
                    flag = true;
                }
            }
            if(flag) break;
        }

        System.out.println(answer);
    }
}

//class Point{
//    public int x, y;
//    Point(int x, int y) {
//        this.x = x;
//        this.y = y;
//    }
//}

//class TomatoBfs {
//    static int[] dx={-1, 0, 1, 0};
//    static int[] dy={0, 1, 0, -1};
//    static int[][] board, dis;
//    static int n, m;
//    static Queue<Point> Q = new LinkedList<>();
//    public void BFS() {
//        while(!Q.isEmpty()) {
//            Point tmp = Q.poll();
//
//            for(int i=0; i<4; i++) {
//                int nx = tmp.x + dx[i];
//                int ny = tmp.y + dy[i];
//
//                if(nx >= 0 && nx < n && ny >= 0 && ny < m && board[nx][ny] == 0) {
//                    board[nx][ny] = 1;
//                    Q.offer(new Point(nx, ny));
//                    dis[nx][ny] = dis[tmp.x][tmp.y] + 1;
//                }
//            }
//        }
//    }
//
//    public static void main(String[] args){
//        TomatoBfs T = new TomatoBfs();
//        Scanner kb = new Scanner(System.in);
//
//        m = kb.nextInt();
//        n = kb.nextInt();
//        board = new int[n][m];
//        dis = new int[n][m];
//
//        for(int i = 0; i < n; i++) {
//            for(int j = 0; j< m; j++) {
//                board[i][j] =kb.nextInt();
//                if(board[i][j] == 1) Q.offer(new Point(i, j));
//            }
//        }
//        T.BFS();
//
//        boolean flag = true;
//        int answer=Integer.MIN_VALUE;
//
//        for(int i = 0; i < n; i++) {
//            for(int j = 0; j < m; j++) {
//                if(board[i][j] == 0) flag=false;
//            }
//        }
//
//        if(flag) {
//            for(int i=0; i<n; i++) {
//                for(int j=0; j<m; j++) {
//                    answer = Math.max(answer, dis[i][j]);
//                }
//            }
//            System.out.println(answer);
//        }
//        else System.out.println(-1);
//    }
//}
