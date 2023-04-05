package infinflearnAlgorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

class Lecture implements Comparable<Lecture> {
    int income;
    int day;

    public Lecture(int income, int day) {
        this.income = income;
        this.day = day;
    }

    @Override
    public int compareTo(Lecture o) {
        return o.day- this.day;
    }
}

public class MaxIncome {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        ArrayList<Lecture> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String[] s = br.readLine().split(" ");
            list.add(new Lecture(Integer.parseInt(s[0]), Integer.parseInt(s[1])));
        }

        // day 기반 내림 차순 정렬
        Collections.sort(list);
        // queue 선언
        PriorityQueue<Integer> pQ = new PriorityQueue<>(Collections.reverseOrder());

        int maxDay = list.get(0).day;
        int answer = 0;
        int j = 0;

        for(int i = maxDay; i >= 1; i--) {
            while(j < n && list.get(j).day >= i) {
                pQ.offer(list.get(j).income);
                j++;
            }
            if(!pQ.isEmpty()) answer += pQ.poll();
        }

        System.out.println(answer);
    }
}
