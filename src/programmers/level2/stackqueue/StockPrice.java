package programmers.level2.stackqueue;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class StockPrice {

    public int[] solution(int[] prices) {
        int[] answer = new int[prices.length];
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < prices.length; i++) {

            while (!stack.isEmpty() && prices[i] < prices[stack.peek()]) {
                answer[stack.peek()] = i - stack.peek();
                stack.pop();
            }
            stack.push(i);
        }

        while (!stack.isEmpty()) {
            answer[stack.peek()] = prices.length - stack.peek() - 1;
            stack.pop();
        }
        return answer;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().split(" ");

        // prices 값 입력
        int[] prices = new int[s.length];
        for (int i = 0; i < prices.length; i++) {
            prices[i] = Integer.parseInt(s[i]);
        }

        // 1 2 3 2 3
        StockPrice sp = new StockPrice();
        for (int i = 0; i < sp.solution(prices).length; i++) {
            System.out.print(sp.solution(prices)[i] + " ");
        }
    }
}
