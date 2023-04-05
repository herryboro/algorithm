package infinflearnAlgorithm.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

class Participant implements Comparable<Participant> {
    int time;
    String end;

    public Participant(int time, String end) {
        this.time = time;
        this.end = end;
    }

    @Override
    public int compareTo(Participant o) {
        if (this.time == o.time) {
            return this.end.compareTo(o.end);
        } else {
            return Integer.compare(this.time, o.time);
        }
    }
}

public class Wedding {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        ArrayList<Participant> participants = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String[] s = br.readLine().split(" ");
            participants.add(new Participant(Integer.parseInt(s[0]), "s"));
            participants.add(new Participant(Integer.parseInt(s[1]), "e"));
        }

        Collections.sort(participants);

        int cnt = 0;
        int answer = 0;

        for (Participant participant : participants) {
            if (participant.end.equals("s")) {
                cnt++;
                answer = Math.max(cnt, answer);
            } else {
                cnt--;
            }
        }

        System.out.println(answer);
    }
}
