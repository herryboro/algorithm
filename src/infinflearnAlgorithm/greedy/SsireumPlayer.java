package infinflearnAlgorithm.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

class Player implements Comparable<Player> {
    int height;
    int weight;

    public Player(int height, int weight) {
        this.height = height;
        this.weight = weight;
    }

    @Override
    public int compareTo(Player o) {
        return o.height - this.height;
    }
}

public class SsireumPlayer {

    public static void main(String[] args) throws IOException {
        int answer = 1;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // n 값
        int n = Integer.parseInt(br.readLine());

        // 씨름 선수 정보를 가지고 있는 Player 객체를 arraylist에 담는다.
        ArrayList<Player> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String[] s = br.readLine().split(" ");
            list.add(new Player(Integer.parseInt(s[0]), Integer.parseInt(s[1])));
        }
        // 키 기준 내림차순 정렬
        Collections.sort(list);

        int maxWeight = list.get(0).weight;

        for (int i = 1; i < list.size(); i++) {
            if (maxWeight < list.get(i).weight) {
                answer++;
                maxWeight = list.get(i).weight;
            }
        }

        System.out.println(answer);
    }
}
