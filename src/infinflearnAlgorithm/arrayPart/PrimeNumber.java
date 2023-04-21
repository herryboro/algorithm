package infinflearnAlgorithm.arrayPart;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PrimeNumber {
    /*
        순수 이중 포문 풀이 -> 시간 초과
     */
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        int n = Integer.parseInt(br.readLine());
//
//        int leng = 0;
//        int answer = 0;
//
//        for (int i = 1; i <= n; i++) {
//            for (int j = 1; j <= i; j++) {
//                if(i % j == 0) leng++;
//            }
//
//            if(leng == 2) answer++;
//            leng = 0;
//        }
//
//        System.out.println(answer);
//    }

    /*
        에라토스체네스의 체
     */
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n + 1];

        int answer = 0;

        for (int i = 2; i <= n; i++) {
            if (arr[i] == 0) {
                answer++;

                for (int j = i; j <= n; j += i) {
                    if(arr[j] % i == 0) arr[j] = 1;
                }
            }
        }

        System.out.println(answer);
    }
}
