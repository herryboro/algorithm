package beakjoon.step3;

import java.io.*;

public class APlusB_8 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int cnt = Integer.parseInt(br.readLine());

        for(int i = 0; i < cnt; i++) {
            String s = br.readLine();
            String[] numStr = s.split(" ");

            int firstNum = Integer.parseInt(numStr[0]);
            int secondNum = Integer.parseInt(numStr[1]);

            bw.write("Case #" + (i+1) + ": " + firstNum + " + " + secondNum + " = ");
            bw.write(String.valueOf(firstNum + secondNum));
            bw.newLine();
        }
        br.close();

        bw.flush();
        bw.close();
    }
}
