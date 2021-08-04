package beakjoon.step3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PrintStar {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(br.readLine());
        int cnt = num-1;
        String star = "*";

        for (int i = 0; i < num; i++) {
            for (int j = 0; j < num-cnt; j++) {
                System.out.print(star);
            }
            if(cnt == 0) {
                break;
            }
            cnt--;
            System.out.println();
        }
    }
}
