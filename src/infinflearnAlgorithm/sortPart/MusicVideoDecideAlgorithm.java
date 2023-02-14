package infinflearnAlgorithm.sortPart;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class MusicVideoDecideAlgorithm {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            // n, m
            String[] s = br.readLine().split(" ");
            int n = Integer.parseInt(s[0]);
            int m = Integer.parseInt(s[1]);

            // 부른 곡들의 분
            ArrayList<Integer> list = new ArrayList<>();
            int sum = 0; // rp 설정을 위한 sum값

            String[] numArr = br.readLine().split(" ");
            for (int i = 0; i < n; i++) {
                list.add(Integer.parseInt(numArr[i]));
                sum += Integer.parseInt(numArr[i]);
            }

            // 이분 탐색 알고리즘으로 최소 용량 탐색
            int lp = 0, rp = sum;
            int mid = 0, answer = 0;

            while (lp <= rp) {
                mid = (lp + rp) / 2;
                int tot = 0, cnt = 1;

                for (int i = 0; i < list.size(); i++) {
                    if (tot+list.get(i) <= mid) {
                        tot += list.get(i);
                    } else {
                        tot = list.get(i);
                        cnt++;
                    }
                }

                if (cnt <= m) {
                    answer = mid;
                    rp = mid - 1;
                } else if (cnt > m) {
                    lp = mid + 1;
                }
            }

            System.out.println(answer);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
