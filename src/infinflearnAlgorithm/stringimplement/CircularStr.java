package infinflearnAlgorithm.stringimplement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CircularStr {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        String answer = "YES";
        String upperStr = s.toUpperCase();

        int len = upperStr.length() / 2;
        // goog
        // 0123

        for (int i = 0; i < len; i++) {
            if (!upperStr.substring(i, i + 1).equals(upperStr.substring(upperStr.length() - 1 - i, upperStr.length()-i))) {
                answer = "NO";
            }
        }
        System.out.println(answer);
    }
}
