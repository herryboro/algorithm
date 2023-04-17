package infinflearnAlgorithm.stringimplement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Palindrome {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // found7timestudyYdutsemit7Dnuof
        String s = br.readLine();
        StringBuilder sb = new StringBuilder();
        String upperStr = s.toUpperCase();
        char[] charArray = upperStr.toCharArray();

        for (char c : charArray) {
            if(c >= 65 && c <= 90) {
                sb.append(c);
            }
        }

        String answer = "YES";

        int len = sb.length() / 2;
        String str = sb.toString();

        for (int i = 0; i < len; i++) {
            if (!str.substring(i, i + 1).equals(str.substring(str.length() - 1 - i, str.length()-i))) {
                answer = "NO";
            }
        }
        System.out.println(answer);
    }
}
