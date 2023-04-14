package infinflearnAlgorithm.stringimplement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LongestWord {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s1 = br.readLine().split(" ");

        int maxindex = 0;
        int maxLeng = 0;

        for (int i = 0; i < s1.length; i++) {
            if (maxLeng < s1[i].length()) {
                maxLeng = s1[i].length();
                maxindex = i;
            }
        }

        System.out.println(s1[maxindex]);
    }
}
