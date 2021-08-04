package beakjoon.step3;

import java.io.*;

public class SmallerThanX {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] var = br.readLine().split(" ");
        int standardNum = Integer.parseInt(var[1]);
        String[] Sequence  = br.readLine().split(" ");
        br.close();

        for(String seq : Sequence) {
            if (Integer.parseInt(seq) < standardNum) {
                bw.write(seq + " ");
            }
        }

        bw.flush();
        bw.close();
    }
}
