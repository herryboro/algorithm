package beakjoon.etc;

import java.util.Scanner;

class TowPointer {
    public int[] solution(int cnt1, int cnt2, int[] arr1, int[] arr2) {
        int[] result = new int[cnt1 + cnt2];
        int i = 0, j = 0, k = 0;

        while (k < cnt1 + cnt2) {
            if (i < cnt1 && j < cnt2) {
                if (arr1[i] < arr2[j]) {
                    result[k] = arr1[i];
                    i++; k++;
                } else {
                    result[k] = arr2[j];
                    j++; k++;
                }
            } else if (i >= cnt1 && j < cnt2) {
                result[k] = arr2[j];
                j++; k++;
            } else if (i < cnt1 && j >= cnt2) {
                result[k] = arr1[i];
                i++; k++;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        TowPointer main = new TowPointer();
        Scanner sc = new Scanner(System.in);

        int cnt1 = sc.nextInt();
        int[] intArr1 = new int[cnt1];

        for (int i = 0; i < cnt1; i++) {
            intArr1[i] = sc.nextInt();
        }

        int cnt2 = sc.nextInt();
        int[] intArr2 = new int[cnt2];

        for (int i = 0; i < cnt2; i++) {
            intArr2[i] = sc.nextInt();
        }

        for (int num : main.solution(cnt1, cnt2, intArr1, intArr2)) {
            System.out.print(num + " ");
        }
    }
}