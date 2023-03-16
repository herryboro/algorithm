package programmers.level2.stackqueue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class RightParenthesis {
    boolean solution(String s) {
        boolean answer = true;
        char[] chars = s.toCharArray();
        Stack<Character> stack = new Stack();

        for (int i = 0; i < chars.length; i++) {
            if(chars[i] == '(') {
                stack.push(chars[i]);
            } else {
                if (stack.isEmpty()) {
                    answer = false;
                    break;
                } else {
                    stack.pop();
                }
            }
        }

        if(stack.size() > 0) answer = false;
        return answer;
    }

    public static void main(String[] args) throws IOException {
        RightParenthesis rp = new RightParenthesis();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String parenthesis = br.readLine();

        System.out.println(rp.solution(parenthesis));
    }
}
