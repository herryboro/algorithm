package programmers.level1;

import java.util.Arrays;

class Str implements Comparable<Str>  {
    int index;
    String s;

    public Str(int index, String s) {
        this.index = index;
        this.s = s;
    }

    @Override
    public int compareTo(Str o) {
        return this.s.compareTo(o.s); // 오름차순 비교
    }
}

public class SortingString {
    public String[] solution(String[] strings, int n) {
        String[] answer = new String[strings.length];
        Str[] strArr = new Str[strings.length];
        // 같은 문자열이 여럿일 경우 대비해서 미리 sortting 시켜놈
        Arrays.sort(strings);

        for (int i = 0; i < strings.length; i++) {
            strArr[i] = new Str(i, strings[i].substring(n, n + 1));
        }
        Arrays.sort(strArr);

        for (int i = 0; i < strArr.length; i++) {
//            answer[i] = strArr[strArr[i].index];
        }

        return answer;
    }
    public static void main(String[] args) {
        String[] str = {"sun", "bed", "car"};
        int n = 1;
        SortingString ss = new SortingString();
        for (int i = 0; i < ss.solution(str, n).length; i++) {
            System.out.print(ss.solution(str, n)[i] + " ");
        }

    }
}
