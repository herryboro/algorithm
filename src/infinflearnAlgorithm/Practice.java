package infinflearnAlgorithm;

import java.util.*;

public class Practice {
    public int solution(String[][] clothes) {
        Map<String, List<String>> clothesMap = new HashMap<>();
        for (String[] item : clothes) {
            String type = item[1];
            String name = item[0];
            List<String> clothesList = clothesMap.getOrDefault(type, new ArrayList<String>());
            clothesList.add(name);
            clothesMap.put(type, clothesList);
        }
        List<String> outfit = new ArrayList<>();
        Map<String, Integer> memo = new HashMap<>();
        return dfs(clothesMap, outfit, 0, memo) - 1;
    }

    private int dfs(Map<String, List<String>> clothesMap, List<String> outfit, int index, Map<String, Integer> memo) {
        // clothesMap size = 2, 1
        if (index == clothesMap.size()) {
            return 1;
        }
        String[] types = clothesMap.keySet().toArray(new String[clothesMap.keySet().size()]);
        // type = green_turban
        String type = types[index];
        List<String> clothesList = clothesMap.get(type);

        int count = 0;
        for (String clothes : clothesList) {
            // outfit {yellow_hat}
            outfit.add(clothes);
            // yellow_hat
            String key = String.join(",", outfit);
            if (memo.containsKey(key)) {
                count += memo.get(key);
            } else {                                        // index = 0
                int subCount = dfs(clothesMap, outfit, index + 1, memo);
                count += subCount;
                memo.put(key, subCount);
            }
            outfit.remove(outfit.size() - 1);
        }
        String key = String.join(",", outfit);
        if (!memo.containsKey(key)) {
            memo.put(key, count);
        }
        count += dfs(clothesMap, outfit, index + 1, memo);
        return count;
    }

    public static void main(String[] args) {
        Practice p = new Practice();
        String[][] clothes = {{"yellow_hat", "headgear"}, {"blue_sunglasses", "eyewear"}, {"green_turban", "headgear"}};
//        String[][] clothes = {{"crow_mask", "face"}, {"blue_sunglasses", "face"}, {"smoky_makeup", "face"}};
        System.out.println(p.solution(clothes));
    }
}

/*
Write a solution function to return the number of different combinations of clothes given a two-dimensional array of clothes.
Here is the basic structure of the code.

class Solution {
    public int solution(String[][] clothes) {
        int answer = 1;

        return answer;
    }
}

*Restrictions
1.Each row of clothes consists of [name of clothes, type of clothes].
2. There are no costumes with the same name.
3. All elements of clothes are made up of string.

Code is Java.
 */