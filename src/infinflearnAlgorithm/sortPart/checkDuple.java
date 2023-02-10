package infinflearnAlgorithm.sortPart;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class checkDuple {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // 학생수
        int n = Integer.parseInt(br.readLine());
        // 학생들이 적어낸 숫자
        ArrayList<Integer> student = new ArrayList<>();

        String[] str = br.readLine().split(" ");
        for(int i = 0; i < str.length; i++) {
            student.add(Integer.parseInt(str[i]));
        }
        // 적어낸 숫자를 오름차순 정렬
        Collections.sort(student);

        /*
            연속으로 같은 숫자가 있는지 확인
            있으면 D를 리턴, 없으면 U를 리턴
         */
        int st = 0;
        String answer = "U";

        for (Integer integer : student) {
            if (st != integer) {
                st = integer;
            } else {
                answer = "D";
                break;
            }
        }
        System.out.println(answer);
    }
}
