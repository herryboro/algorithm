package infinflearnAlgorithm.stringimplement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class compresStr {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // KKHSSSSSSSE
        String s = br.readLine();
        String[] strArr = new String[s.length() + 1];

        for (int i = 0; i < s.length(); i++) {
            strArr[i] = s.substring(i, i + 1);
        }

        int cnt = 1;
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            if (strArr[i].equals(strArr[i + 1])) {
                cnt++;
            } else {
                if (cnt > 1) sb.append(strArr[i] + cnt);
                else sb.append(strArr[i]);
                cnt = 1;
            }
        }
        System.out.println(sb);
    }
}
