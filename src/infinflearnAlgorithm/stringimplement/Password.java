package infinflearnAlgorithm.stringimplement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Password {

    /*
        내풀이
     */
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        int n = Integer.parseInt(br.readLine());
//        String signal = br.readLine();
//        StringBuilder answer = new StringBuilder();
//
//                            // 28
//        for (int i = 0; i <= signal.length()-7; i+=7) {
//            String str = signal.substring(i, i+7);
//            int num = 0;
//                                    // 7
//            for (int j = 0; j < str.length(); j++) {
//                if(str.substring(j, j+1).equals("#")) {
//                    num += Math.pow(2, (str.length() - 1) - j);
//                }
//            }
//            answer.append((char)num);
//        }
//        System.out.println(answer);
//    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String signal = br.readLine();
        StringBuilder answer = new StringBuilder();

        for (int i = 0; i < n; i++) {
            String reStr = signal.substring(0, 7).replace('#', '1').replace('*', '0');
            answer.append((char)Integer.parseInt(reStr, 2));
            signal = signal.substring(7);
        }
        System.out.println(answer);
    }
}
