package infinflearnAlgorithm.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

class Conference implements Comparable<Conference> {
    int startTime;
    int endTime;

    public Conference(int startTime, int endTime) {
        this.startTime = startTime;
        this.endTime = endTime;
    }

    @Override
    public int compareTo(Conference o) {
        if(this.endTime == o.endTime) {
            return this.startTime - o.startTime;
        } else {
            return this.endTime - o.endTime;
        }
    }
}

public class ConferenceRoom {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        ArrayList<Conference> conferences = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String[] s = br.readLine().split(" ");
            conferences.add(new Conference(Integer.parseInt(s[0]), Integer.parseInt(s[1])));
        }
        Collections.sort(conferences);

        int answer = 0;
        int minCnt = Integer.MIN_VALUE;

        for (int i = 0; i < conferences.size(); i++) {
            if(minCnt <= conferences.get(i).startTime) {
                answer++;
                minCnt = conferences.get(i).endTime;
            }
        }

        System.out.println(answer);
    }
}
