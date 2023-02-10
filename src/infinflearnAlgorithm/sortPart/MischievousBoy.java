package infinflearnAlgorithm.sortPart;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class MischievousBoy {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // 학생수
        int n = Integer.parseInt(br.readLine());

        // 일렬로 서있는 학생들의 키 나열
        String[] str = br.readLine().split(" ");
        // 문제에서 주어진 기본 학생들의 키 배열
        ArrayList<Integer> studentTall = new ArrayList<>();

        for(int i = 0; i < str.length; i++) {
            studentTall.add(Integer.parseInt(str[i]));
        }
        // 주어진 학생들의 키 배열을 오름차순으로 정리한 배열
        ArrayList<Integer> ascTall = new ArrayList<>();

        for(int i = 0; i < str.length; i++) {
            ascTall.add(Integer.parseInt(str[i]));
        }
        // 학생 키 오름차순으로 정렬
        Collections.sort(ascTall);

        for (int i = 0; i < n; i++) {
            if (!studentTall.get(i).equals(ascTall.get(i))) {
                System.out.print(i+1 + " ");
            }
        }
    }
}
