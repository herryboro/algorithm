package infinflearnAlgorithm.stackQueue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class Emergency {
    public int solution(int location, int[] priorities) {
        int answer = 0;
        Queue<Integer> queue = new LinkedList<>();

        for (int priority : priorities) {
            queue.add(priority);
        }

        Arrays.sort(priorities);
        int size = priorities.length - 1;

        while (!queue.isEmpty()) {
            Integer i = queue.poll();
            if (i == priorities[size - answer]) {
                answer++;
                location--;
                if (location < 0) break;
            } else {
                queue.add(i);
                location--;
                if (location < 0) location = queue.size() - 1;
            }
        }

        return answer;
    }

    public static void main(String[] args) throws IOException {
        Emergency sq = new Emergency();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            String[] readVal = br.readLine().split(" ");
            // n, m
            int n = Integer.parseInt(readVal[0]);
            int m = Integer.parseInt(readVal[1]);

            String[] riskArr = br.readLine().split(" ");
            // risk 값
            int[] riskVal = new int[n];

            for (int i = 0; i < riskArr.length; i++) {
                riskVal[i] = Integer.parseInt(riskArr[i]);
            }

            System.out.println(sq.solution(m, riskVal));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
