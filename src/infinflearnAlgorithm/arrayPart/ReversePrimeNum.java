package infinflearnAlgorithm.arrayPart;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReversePrimeNum {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] s = br.readLine().split(" ");
        int[] intArr = new int[s.length];

        for (int i = 0; i < n; i++) {
            String numStr = String.valueOf(new StringBuilder(s[i]).reverse());
            int j = 0;

            while(numStr.length() > 0) {
                if(numStr.substring(j, j+1).equals("0")) numStr = numStr.substring(j + 1);
                else break;
            }
            intArr[i] = Integer.parseInt(numStr);
        }

        for (int i = 0; i < intArr.length; i++) {
            int leng = 0;

            for (int j = 1; j <= intArr[i]; j++) {
                if(intArr[i] % j == 0) leng++;
                if(leng > 2) break;
            }

            if(leng == 2) System.out.print(intArr[i] + " ");
        }
    }
}
