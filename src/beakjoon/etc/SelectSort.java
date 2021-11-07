package beakjoon.etc;

import java.util.*;

class SelectSort {
    public int[] solution(int cnt, int[] ascArr) {
        for (int i = 0; i < cnt - 1; i++) {
            for (int j = i + 1; j < cnt; j++) {
                int temp = 0;
                if (ascArr[i] > ascArr[j]) {
                    temp = ascArr[i];
                    ascArr[i] = ascArr[j];
                    ascArr[j] = temp;
                }
            }
        }
        return ascArr;
    }

    public static void main(String[] args) {
        SelectSort main = new SelectSort();
        Scanner sc = new Scanner(System.in);
        int cnt = sc.nextInt();
        int[] ascArr = new int[cnt];
        for (int i = 0; i < cnt; i++) {
            ascArr[i] = sc.nextInt();
        }
        for (int in : main.solution(cnt, ascArr)) {
            System.out.print(in + " ");
        }
    }
}