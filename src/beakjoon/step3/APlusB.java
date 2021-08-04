package beakjoon.step3;

import java.util.Scanner;

public class APlusB {
    public static void main(String[] args) {
        Scanner var = new Scanner(System.in);
        int cnt = var.nextInt();
        var.nextLine();                 // nextInt후 nextLine 사용시 nextLine이 동작하지 않는 현상
                                        // scanner는 엔터도 값으로 인식, 이 문제에서는 var.nextLine(); 를 한번 더 입력함으로써 해결
        int[] arrayInt = new int[cnt];

        for(int i = 0; i < cnt; i++) {
            String s = var.nextLine();
            String[] numStr = s.split(" ");

            int firstNum = Integer.parseInt(numStr[0]);
            int secondNum = Integer.parseInt(numStr[1]);
            arrayInt[i] = firstNum + secondNum;
        }
        var.close();

        for (int i = 0; i < arrayInt.length; i++) {
            System.out.println(arrayInt[i]);
        }
    }
}
