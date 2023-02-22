package infinflearnAlgorithm.bfsdfsBasic.bfsdfsPractice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TakeIntoDog {
    static int answer = 0;
    static int c, n;

    public int solution(int index, int sum, int[] puppy) {
        if(sum > c) return answer;

        if(index == n) {
            answer = Math.max(answer, sum);
        } else {
            solution(index + 1, sum + puppy[index], puppy);
            solution(index + 1, sum, puppy);
        }
        return answer;
    }
    public static void main(String[] args) throws IOException {
        TakeIntoDog dog = new TakeIntoDog();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().split(" ");

        c = Integer.parseInt(s[0]);
        n = Integer.parseInt(s[1]);

        int[] puppy = new int[n];
        for (int i = 0; i < n; i++) {
            puppy[i] = Integer.parseInt(br.readLine());
        }
        System.out.println(dog.solution(0,0,puppy));
//        System.out.println(answer);
    }
}
