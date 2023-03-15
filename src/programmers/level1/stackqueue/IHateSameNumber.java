package programmers.level1.stackqueue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class IHateSameNumber {
    public int[] solution(int[] arr) {
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < arr.length; i++) {
            if (!stack.empty()) {
                if (stack.peek() != arr[i]) stack.push(arr[i]);
            } else {
                stack.push(arr[i]);
            }
        }
        int[] answer = new int[stack.size()];

        for (int i = stack.size() - 1; i >= 0; i--) {
            Integer pop = stack.pop();
            answer[i] = pop;
        }
        return answer;
    }


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().split(" ");
        int[] arr = new int[s.length];
        for (int i = 0; i < s.length; i++) {
            arr[i] = Integer.parseInt(s[i]);
        }
        // 1 1 3 3 0 1 1
        IHateSameNumber in = new IHateSameNumber();
        int[] an = in.solution(arr);
        for (int i = 0; i < s.length; i++) {
            System.out.println(an[i] + " ");
        }
    }
}
