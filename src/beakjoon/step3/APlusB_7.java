package beakjoon.step3;

import java.io.*;

public class APlusB_7 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int cnt = Integer.parseInt(br.readLine());
        String[] arrayInt = new String[cnt];

        for(int i = 0; i < cnt; i++) {
            String s = br.readLine();
            String[] numStr = s.split(" ");

            int firstNum = Integer.parseInt(numStr[0]);
            int secondNum = Integer.parseInt(numStr[1]);
            arrayInt[i] = Integer.toString(firstNum + secondNum);
        }
        br.close();

        for (int i = 0; i < arrayInt.length; i++) {
            bw.write( "Case #" + (i+1) + ": " + arrayInt[i]);
            bw.newLine();
        }
        bw.flush();
        bw.close();
    }
}
