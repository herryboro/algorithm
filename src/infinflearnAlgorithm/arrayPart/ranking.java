package infinflearnAlgorithm.arrayPart;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class ranking {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] s = br.readLine().split(" ");

        // 정렬을 위한 arraylist
        ArrayList<Integer> rank = new ArrayList<>();
        // 정답 출력을 위한 배열
        int[] answer = new int[n];

        for (int i = 0; i < n; i++) {
            rank.add(Integer.parseInt(s[i]));
            answer[i] = Integer.parseInt(s[i]);
        }

        // 오름차순 정렬
        Collections.sort(rank, Collections.reverseOrder());

        // hashmap에 점수당 순위 put
        HashMap<Integer, Integer> map = new HashMap<>();
        int rankCnt = 0;

        for (int i = 0; i < n; i++) {
            if (!map.containsKey(rank.get(i))) {
                map.put(rank.get(i), i + 1);
                rankCnt = i + 1;
            } else {
                map.put(rank.get(i), rankCnt);
            }
        }

        for (int i = 0; i < answer.length; i++) {
            System.out.print(map.get(answer[i]) + " ");
        }
    }
}
