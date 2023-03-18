package programmers.level2.stackqueue;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class StockPrice {
    public int[] solution(int[] prices) {
        int[] answer = new int[prices.length];
        Stack<Integer> stack = new Stack<>();

        // prices : [1, 2, 3, 2, 3]

        // 주식이 앞전 값보다 증가하는 경우에는 stack에 해당 index를 push
        for (int i = 0; i < prices.length; i++) {
            // 반대의 경우에는 [본인의 index - 앞전 값의 index] 를 해주면 가격이 떨어지지 않은 기간을 알 수 있다. 이 구한 값을 answer에 넣어준다.
            // 더 이전의 배열 값에도 가격이 떨어진 경우가 있을 수 있으니 반복 탐색해서 위의 [본인의 index - 앞전 값의 index] 계산 값을 answer에 넣어준다.
            // ex) 배열 3 4 5 1 3일때 -> index 2의 5값, index 1의 4 값은 index 3의 1값을 만났을때 최초 주식의 손해를 본 경우
            while(!stack.isEmpty() && prices[i] < prices[stack.peek()]) {
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
