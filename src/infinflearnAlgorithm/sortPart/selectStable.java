package infinflearnAlgorithm.sortPart;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class selectStable {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] split = br.readLine().split(" ");
        int n = Integer.parseInt(split[0]);
        int c = Integer.parseInt(split[1]);

        String[] s = br.readLine().split(" ");
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(Integer.parseInt(s[i]));
        }
        // 좌표 오름차순
        Collections.sort(list);

        // 이분탐색 로직
        int lp = 1, rp = list.get(list.size() - 1);
        int answer = 0;

        while (lp <= rp) {
            int mid = (lp + rp) / 2;
            int possibleDistance = 1;
            int stand = 1;

            for (int i = 0; i < list.size() - 1; i++) {
                if(list.get(i + 1) - stand >= mid) {
                    possibleDistance++;
                    stand = list.get(i + 1);
                }
            }

            if(possibleDistance < c) {
                rp = mid - 1;
            } else {
                lp = mid + 1;
                answer = mid;
            }
        }

        System.out.println(answer);
    }
}
