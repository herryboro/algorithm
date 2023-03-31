package infinflearnAlgorithm.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

class Participant implements Comparable<Participant>{
    int startTime;
    int endTime;

    public Participant(int startTime, int endTime) {
        this.startTime = startTime;
        this.endTime = endTime;
    }

    @Override
    public int compareTo(Participant o) {
        return this.startTime - o.startTime;
    }
}

public class Wedding {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        ArrayList<Participant> participants = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String[] s = br.readLine().split(" ");
            participants.add(new Participant(Integer.parseInt(s[0]), Integer.parseInt(s[1])));
        }

        Collections.sort(participants);

        int answer = 0;
        int compareVal = 0;
        int left = participants.get(0).startTime;
        int right = participants.get(0).endTime;

        for (int i = 0; i < participants.size(); i++) {
            if(left >= participants.get(i).startTime || right > participants.get(i).startTime) {
                compareVal++;
            } else {
                left = participants.get(i).startTime;
                right = participants.get(i).endTime;
                answer = Math.max(answer, compareVal);
                compareVal = 0;
            }
        }
        System.out.println(answer);
    }
}
