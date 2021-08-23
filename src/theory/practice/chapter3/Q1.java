package theory.practice.chapter3;

import java.util.Scanner;

public class Q1 {
    static int searchIndex(int[] x, int cnt, int result) {
       x[cnt] = result;

        for (int i = 0; i < cnt; i++) {
            if (x[i] == result) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("요솟수: ");
        int cnt = sc.nextInt();
        int forLinearArray[] = new int[cnt + 1];

        for (int i = 0; i < cnt; i++) {
            System.out.print("x[" + i + "]: ");
            forLinearArray[i] = sc.nextInt();
        }
        System.out.print("검색할 값: ");
        int result = sc.nextInt();
        sc.close();

        int num = searchIndex(forLinearArray, cnt, result);
        if (num != -1) {
            System.out.println(result + "는(은) x[" + num + "]에 있습니다.");
        } else {
            System.out.println("검색하신 값은 존재하지 않습니다.");
        }
    }
}
