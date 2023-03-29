package programmers.level1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class MakeRoughlyKeyboard {
    public int[] solution(String[] keymap, String[] targets) {
        int[] answer = new int[targets.length];
        HashMap<String, Integer> map = new HashMap<>();

        for (String str : keymap) {
            for (int i = 0; i < str.length(); i++) {
                String substring = str.substring(i, i + 1);

                if (map.get(substring) == null) {
                    map.put(substring, i + 1);
                } else if(map.get(substring) > i + 1) {
                    map.put(substring, i + 1);
                }
            }
        }

        for (int i = 0; i < targets.length; i++) {
            int putVal = 0;

            for (int j = 0; j < targets[i].length(); j++) {
                // 문자열 못 만들면 -1
                if (map.get(targets[i].substring(j, j + 1)) == null) {
                    putVal = -1;
                    break;
                }
                putVal += map.get(targets[i].substring(j, j + 1));
            }
            answer[i] = putVal;
        }

        return answer;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] keymap = br.readLine().split(",");
        String[] targets = br.readLine().split(",");

        MakeRoughlyKeyboard mrk = new MakeRoughlyKeyboard();

        // ABACD,BCEFD / ABCD,AABB
        // AGZ,BSSS / ASA,BGZ
        for (int i = 0; i < mrk.solution(keymap, targets).length; i++) {
            System.out.print(mrk.solution(keymap, targets)[i] + " ");
        }
    }
}
