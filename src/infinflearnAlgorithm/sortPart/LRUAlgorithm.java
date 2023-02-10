package infinflearnAlgorithm.sortPart;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class LRUAlgorithm {
    static int checkDuple(int[] answerArr, int value) {
        int a = 0;

        for (int i = 0; i < answerArr.length; i++) {
            if (answerArr[i] == value) {
                a = i;
                break;
            }
        }
        return a;
    }
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] sn = br.readLine().split(" ");
        int s = Integer.parseInt(sn[0]);
        int n = Integer.parseInt(sn[1]);
        int[] arr = new int[n];

        String[] str = br.readLine().split(" ");
        for(int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(str[i]);
        }
        /**
         *  예시)
         *  입력: 5 9
         *  출력: 1 2 3 2 6 2 3 5 7
         */
        int[] answer = new int[s];

        for (int i = 0; i < n; i++) {
            int dupleCnt = checkDuple(answer, arr[i]);
            if (dupleCnt == 0) {
                for (int j = s-1; j > 0; j--) {
                    answer[j] = answer[j - 1];
                }
            } else {
                for (int j = dupleCnt; j > 0; j--) {
                    answer[j] = answer[j - 1];
                }
            }
            answer[0] = arr[i];
        }

        for (int i = 0; i < answer.length; i++) {
            System.out.print(answer[i] + " ");
        }
    }
}
