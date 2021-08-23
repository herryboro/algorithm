package theory.practice.chapter3;

import java.util.Scanner;

public class Q4 {
    static int binarySearchX(int[] binaryArray, int cnt, int result) {
        int pl = 0;
        int pr = cnt - 1;

        do {
            int cen = (pl + pr) / 2;

            if (binaryArray[cen] == result) {
                if (binaryArray[cen - 1] == result) {
                    cen--;
                }
                return cen;
            } else if (binaryArray[cen] < result) {
                pl = cen + 1;
            } else if (binaryArray[cen] > result) {
                pr = cen - 1;
            }
        } while (pl <= pr);
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("요솟수: ");
        int cnt = sc.nextInt();
        int[] binaryArray = new int[cnt];

        for (int i = 0; i < cnt; i++) {
            binaryArray[i] = sc.nextInt();
        }
        System.out.print("검색값: ");
        int result = sc.nextInt();

        int num = binarySearchX(binaryArray, cnt, result);
        if (num != -1) {
            System.out.println(result + "는 [" + num + "] 요소에 있습니디.");
        } else {
            System.out.println("존재 하지 않습니다.");
        }
    }
}


