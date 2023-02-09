package theory.algorithm.selectsort;

import java.util.ArrayList;
import java.util.Collections;

public class SelectSort {
    ArrayList<Integer> sort(ArrayList<Integer> dataList) {
        int min;

        for (int i = 0; i < dataList.size() - 1; i++) {
            min = i;
            for (int j = i + 1; j < dataList.size(); j++) {
                if (dataList.get(min) > dataList.get(j)) {
                    min = j;
                }
            }
            Collections.swap(dataList, min, i);
        }
        return dataList;
    }

    public static void main(String[] args) {
        ArrayList<Integer> testData = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            testData.add((int)(Math.random() * 10));
        }

        SelectSort select = new SelectSort();
        System.out.println(select.sort(testData));
    }
}
