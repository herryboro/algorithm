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

        // bridge_length 길이 만큼 queue 초기값 0으로 세팅
        for (int i = 0; i < bridge_length; i++) {
            queue.offer(0);
        }

        int index = 0;
        // 다리 위의 총 차량 무게
        int weightSum = 0;

        while(index < truck_weights.length) {
            // 다리에서 나갈 차량 poll
            int outCar = queue.poll();
            // 나간 차량의 무게를 다리 위에 있는 차량의 총 무게에서 뺌
            weightSum -= outCar;

            // 총 차량 무게와 한도 초과 무게를 비교시 작거나 같은 경우에는 다음 차량이 다리 위로 들어와도 됨
            if(weightSum + truck_weights[index] <= weight) {
                queue.offer(truck_weights[index]);
                weightSum += truck_weights[index];
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
