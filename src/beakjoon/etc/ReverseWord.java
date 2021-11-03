package beakjoon.etc;

import java.util.Scanner;

public class ReverseWord {
    public String[] solution(int cnt, String[] s) {

        for (int i = 0; i < cnt; i++) {
            String changeStr = "";
            for (int j = s[i].length(); j > 0; j--) {
                changeStr += s[i].substring(j - 1 , j);
            }
            s[i] = changeStr;
        }
        return s;
    }

    public static void main(String[] args) {
        ReverseWord reverseWord = new ReverseWord();
        Scanner sc = new Scanner(System.in);
        int cnt = sc.nextInt();
        String[] s = new String[cnt];

        for (int i = 0; i < cnt; i++) {
            s[i] = sc.next();
        }

        for (String str : reverseWord.solution(cnt, s)) {
            System.out.println(str);
        }
    }
}
