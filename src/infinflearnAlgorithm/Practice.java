package infinflearnAlgorithm;

import java.util.*;

public class Practice {
    public String solution(String[][] C) {
        Stack<String> stack = new Stack<>();
        int current = -1;

        for (int i = 0; i < C.length; i++) {
            if (C[i][0].equals("PUSH")) {
                if (current != stack.size() - 1) {
                    while (stack.size() > current + 1) {
                        stack.pop();
                    }
                }
                stack.push(C[i][1]);
                current++;
            } else if (C[i][0].equals("BACK")) {
                int move = Integer.parseInt(C[i][1]);

                if (current - move >= -1) {
                    current -= move;
                } else {
                    current = -1;
                }
            } else if (C[i][0].equals("NEXT")) {
                int move = Integer.parseInt(C[i][1]);

                if (current + move <= stack.size() - 1) {
                    current += move;
                } else {
                    current = stack.size() - 1;
                }
            }
        }
        return stack.get(current);
    }

    public static void main(String[] args) {
        Practice p = new Practice();
        String[][] C = {
                {"PUSH","www.domain1.com"}, {"PUSH","www.domain2.com"}, {"PUSH","www.domain3.com"},
                {"BACK","1"}, {"BACK","1"}, {"PUSH","www.domain4.com"}
        };
        System.out.println(p.solution(C));
    }
}

/*
Write a solution function to return the number of different combinations of clothes given a two-dimensional array of clothes.
Here is the basic structure of the code.

class Solution {
    public int solution(String[][] clothes) {
        int answer = 1;

        return answer;
    }
}

*Restrictions
1.Each row of clothes consists of [name of clothes, type of clothes].
2. There are no costumes with the same name.
3. All elements of clothes are made up of string.

Code is Java.
 */