package infinflearnAlgorithm.stringimplement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class ConvertSpecialStr {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();

        char[] charArray = s.toCharArray();
        // 특수문자 저장 hashmap
        HashMap<Integer, Character> map = new HashMap<>();
        // 문자 저장 list
        ArrayList<Character> list = new ArrayList<>();

        for (int i = 0; i < charArray.length; i++) {
            if (charArray[i] >= 65 && charArray[i] <= 90 || charArray[i] >= 97 && charArray[i] <= 122) {
                list.add(charArray[i]);
            } else {
                map.put(i, charArray[i]);
            }
        }

        // list 반대로
        Collections.reverse(list);

        int index = 0;

        for (int i = 0; i < charArray.length; i++) {
            if(map.containsKey(i)) {
                System.out.print(map.get(i));
            } else {
                System.out.print(list.get(index));
                index++;
            }
        }
    }
}
