package programmers.level3.hash;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class UndestroyedBuilding {
    public int solution(int[][] board, int[][] skill) {

        for (int i = 0; i < skill.length; i++) {
            int side = skill[i][0];
            //              2                   0                       2                       3
            int r1 = skill[i][1]; int c1 = skill[i][2]; int r2  = skill[i][3]; int c2  = skill[i][4];
            int degree = skill[i][5];

            for (int j = r1; j <= r2; j++) {
                for (int k = c1; k <= c2; k++) {
                    if(side == 1) board[j][k] -= degree;
                    else board[j][k] += degree;
                }
            }
        }

        int answer = 0;
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if(board[i][j] > 0) answer++;
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
