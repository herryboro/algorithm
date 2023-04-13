package infinflearnAlgorithm.stringimplement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FindStr {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // 주어진 문자열
        String s = br.readLine();
        String upperCase = s.toUpperCase();

        // 특정 문자
        String s1 = br.readLine().toUpperCase();
        int cnt = 0;

        for (int i = 0; i < s.length(); i++) {
            if (upperCase.substring(i, i + 1).equals(s1)) {
                cnt++;
            }
        }

        System.out.println(cnt);

    }
}
