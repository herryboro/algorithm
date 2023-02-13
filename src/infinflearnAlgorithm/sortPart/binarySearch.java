package infinflearnAlgorithm.sortPart;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class binarySearch {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // n, m
        String[] s = br.readLine().split(" ");
        int n = Integer.parseInt(s[0]);
        int m = Integer.parseInt(s[1]);

        // 주어진 수들 오름차순 정렬
        String[] num = br.readLine().split(" ");
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(Integer.parseInt(num[i]));
        }
        Collections.sort(list);

        // 이분 탐색으로 m의 index값 찾기
        int lp = 0;
        int rp = n;
        int index = 0;

        while (true) {
            int mid = (lp + rp) / 2;

            if(list.get(mid) < m) {
                lp = mid - 1;
            } else if(list.get(mid) > m) {
                rp = mid + 1;
            } else {
                index = mid + 1;
                break;
            }
        }
        System.out.println(index);
    }
}
