package infinflearnAlgorithm.bfsdfsBasic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FindCalf {
    /**
     *  내풀이
     */
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().split(" ");
        // s 현수 좌표, e 송아지 좌표
        int s = Integer.parseInt(str[0]);
        int e = Integer.parseInt(str[1]);

        int prevSt = 0, answer = 0, cnt = 1;

        if (s < e) {
            int dubleJump = s + 5;

            while (dubleJump < e) {
                cnt++;
                dubleJump = dubleJump + 5;
                prevSt = dubleJump - 5;
            }

            // cnt = 2, dubleJump = 15, prevSt = 10
            if (dubleJump - e <= 2) {
                answer = cnt + (dubleJump - e);
            } else {
                // cnt - 1 => e가 작으면 5단계 점프를 하면 안됨. 따라서 5단계 점프 횟수인 cnt를 하나 빼준다.
                answer = (cnt - 1) + (e - prevSt);
            }
        } else {
            answer = s - e;
        }

        System.out.println(answer);
    }
}
