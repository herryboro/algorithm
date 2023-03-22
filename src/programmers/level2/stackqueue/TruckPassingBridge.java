package programmers.level2.stackqueue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class TruckPassingBridge {
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        int answer = 0;
        Queue<Integer> queue = new LinkedList<>();
        for (int i = 0; i < bridge_length; i++) {
            queue.offer(0);
        }

        int index = 0;
        int sumWeight = 0;

        while (index < truck_weights.length) {
            int wcfb = queue.poll(); // mean: the weight of the car in front of the bridge

            sumWeight -= wcfb;

            if (sumWeight + truck_weights[index] <= weight) {
                queue.offer(truck_weights[index]);
                sumWeight += truck_weights[index];
                index++;
            } else {
                queue.offer(0);
            }
            answer++;
        }

        return answer + bridge_length;
    }


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int bridgeLang = Integer.parseInt(br.readLine());
        int weight = Integer.parseInt(br.readLine());

        String[] s = br.readLine().split(" ");
        int[] truckWight = new int[s.length];
        for (int i = 0; i < truckWight.length; i++) {
            truckWight[i] = Integer.parseInt(s[i]);
        }

        TruckPassingBridge tpb = new TruckPassingBridge();
        // 2 / 10 / 7 4 5 6
        // 100 / 100 / 10
        // 100/100/10 10 10 10 10 10 10 10 10 10
        System.out.println(tpb.solution(bridgeLang, weight, truckWight));
    }
}
