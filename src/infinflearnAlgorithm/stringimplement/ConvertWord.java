package infinflearnAlgorithm.stringimplement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ConvertWord {
    public String convertWord(String str) {
        String answer = "";

        for (int i = str.length()-1; i >= 0; i--) {
            answer += str.substring(i, i + 1);
        }
        return answer;
    }
    public static void main(String[] args) throws IOException {
        ConvertWord cw = new ConvertWord();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] strArr = new String[n];

        for (int i = 0; i < n; i++) {
            strArr[i] = br.readLine();
        }

        for (String s : strArr) {
            System.out.println(cw.convertWord(s));
        }
    }
}
