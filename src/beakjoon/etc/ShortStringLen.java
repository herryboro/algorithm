package beakjoon.etc;

import java.util.*;

class ShortStringLen {
    public int[] solution(String s, char t) {
        int point = 1000;
        int[] resArr = new int[s.length()];

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == t) {
                point = 0;
                resArr[i] = 0;
            } else {
                point++;
                resArr[i] = point;
            }
        }
        point = 1000;

        for (int i = resArr.length - 1; i >= 0 ; i--) {
            if (s.charAt(i) == t) {
                point = 0;
                resArr[i] = point;
            } else {
                point++;
                resArr[i] = Math.min(resArr[i], point);
            }
        }
        return resArr;
    }

    public static void main(String[] args) {
        ShortStringLen ssl = new ShortStringLen();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char c = sc.next().charAt(0);
        for(int x : ssl.solution(str, c)) {
            System.out.print(x + " ");
        }
    }
}
