package infinflearnAlgorithm.bfsdfsBasic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class FindCalf {
    /**
     * bfs 풀이
     */
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().split(" ");
        // s 현수 좌표, e 송아지 좌표
        int s = Integer.parseInt(str[0]);
        int e = Integer.parseInt(str[1]);

        int answer = 1;
        int level = 0;
        int findVal = 0;

        // queue
        Queue<Integer> bfsQueue = new LinkedList<>();
        // 중복 방문 처리 배열
        int[] ch = new int[10001];
        // 점프 배열
        int[] jump = {1, -1, 5};
        // 현수 첫 위치는 넣어준다.
        bfsQueue.offer(s);
        ch[s] = 1;

        while (!bfsQueue.isEmpty()) {
            // bfs 단계
            level = bfsQueue.size();

            for (int i = 0; i < level; i++) {
                int pollVal = bfsQueue.poll();

                // 점프 단계 계산(1단, -1단, 5단) 후 queue에 offer
                for (int j = 0; j < jump.length; j++) {
                    int jumpVal = pollVal + jump[j];

                    if(jumpVal == e) {
                        findVal = 1;
                        break;
                    } else if (ch[jumpVal] != 1 && jumpVal >= 1 && jumpVal <= 10000) {
                        ch[jumpVal] = 1;
                        bfsQueue.offer(jumpVal);
                    }
                }
                // 값 찾으면 반복문 바로 탈출(while 탈출)
                if(findVal == 1) break;
            }

            // 값 찾으면 반복문 바로 탈출(while 탈출)
            if(findVal == 1) break;
            answer++;
        }
        System.out.println(answer);
    }

    /**
     *  내풀이
     */
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        String[] str = br.readLine().split(" ");
//        // s 현수 좌표, e 송아지 좌표
//        int s = Integer.parseInt(str[0]);
//        int e = Integer.parseInt(str[1]);
//
//        int prevSt = 0, answer = 0, cnt = 1;
//
//        if (s < e) {
//            int dubleJump = s + 5;
//
//            while (dubleJump < e) {
//                cnt++;
//                dubleJump = dubleJump + 5;
//                prevSt = dubleJump - 5;
//            }
//
//            // cnt = 2, dubleJump = 15, prevSt = 10
//            if (dubleJump - e <= 2) {
//                answer = cnt + (dubleJump - e);
//            } else {
//                // cnt - 1 => e가 작으면 5단계 점프를 하면 안됨. 따라서 5단계 점프 횟수인 cnt를 하나 빼준다.
//                answer = (cnt - 1) + (e - prevSt);
//            }
//        } else {
//            answer = s - e;
//        }
//
//        System.out.println(answer);
//    }
}
