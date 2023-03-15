package programmers.level2.stackqueue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class DevelopFunction {
    public int[] solution(int[] progresses, int[] speeds) {
        Queue<Integer> queue = new LinkedList<>();

        for (int i = 0; i < progresses.length; i++) {
            int day = (int) Math.ceil((double)(100 - progresses[i]) / speeds[i]);
            queue.offer(day);
        }

        ArrayList<Integer> list = new ArrayList<>();

        int cnt = 1;
        // 처음 값
        int prevVal = queue.poll();

        while (!queue.isEmpty()) {
            // 다음 항 값
            int backVal = queue.poll();

            if (prevVal >= backVal) {
                cnt++;
            } else {
                list.add(cnt);
                cnt = 1;
                prevVal = backVal;
            }
        }
        list.add(cnt);

        int[] answer = new int[list.size()];

        for (int i = 0; i < answer.length; i++) {
            answer[i] = list.get(i);
        }
        return answer;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().split(" ");
        // progresses
        int[] progresses = new int[s.length];
        for (int i = 0; i < progresses.length; i++) {
            progresses[i] = Integer.parseInt(s[i]);
        }

        // speeds
        String[] s1 = br.readLine().split(" ");
        int[] speeds = new int[s1.length];

        for (int i = 0; i < speeds.length; i++) {
            speeds[i] = Integer.parseInt(s1[i]);
        }
        // 93 30 55 / 95 90 99 99 80 99
        // 1 30 5 / 1 1 1 1 1 1
        DevelopFunction df = new DevelopFunction();
        for (int i = 0; i < df.solution(progresses, speeds).length; i++) {
            System.out.print (df.solution(progresses, speeds)[i] + " ");
        }

    }
}
