package beakjoon.etc;

import java.io.IOException;
import java.util.Scanner;

public class BubbleSort {
    public int[] solution(int cnt, int[] intArr) {
        for (int i = 1; i < cnt; i++) {
            for (int j = 0; j < cnt - i; j++) {
                int temp = 0;

                if (intArr[j] > intArr[j + 1]) {
                    temp = intArr[j + 1];
                    intArr[j + 1] = intArr[j];
                    intArr[j] = temp;
                }
            }
        }
        return intArr;
    }

    public static void main(String[] args) throws IOException {
        BubbleSort main = new BubbleSort();
        Scanner sc = new Scanner(System.in);
        int cnt = Integer.parseInt(sc.next());
        int[] intArr = new int[cnt];

        for (int i = 0; i < cnt; i++) {
            intArr[i] = Integer.parseInt(sc.next());
        }

        for (int num : main.solution(cnt, intArr)) {
            System.out.print(num + " ");
        }
    }
}
