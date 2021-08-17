package beakjoon.step4;

import java.util.Scanner;

public class PlusCycle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int standardNum = sc.nextInt();
        int finalNum = standardNum;
        sc.close();

        int cnt = 0;

        while(true) {
            int frontNum = standardNum / 10;
            int restNum = standardNum % 10;

            if (frontNum + restNum >= 10) {
                standardNum = (restNum * 10) + ((frontNum + restNum) - 10);
                if (finalNum == standardNum) {
                    cnt++;
                    break;
                }
                cnt++;
            } else {
                standardNum = (restNum * 10) + (frontNum + restNum);
                if (finalNum == standardNum) {
                    cnt++;
                    break;
                }
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}

