package infinflearnAlgorithm.stringimplement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ConversionCaseSensitive {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        char[] charArray = str.toCharArray();
        StringBuilder answer = new StringBuilder();

        // 아스키코드
        // 대문자 65 ~ 90 , 소문자 97 ~ 122
        for (char c : charArray) {
            if(c >= 65 && c <= 90) answer.append(String.valueOf(c).toLowerCase());
            else answer.append(String.valueOf(c).toUpperCase());
        }

        System.out.println(answer);
    }
}
