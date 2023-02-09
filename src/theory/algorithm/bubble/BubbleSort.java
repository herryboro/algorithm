package theory.algorithm.bubble;

import java.util.ArrayList;
import java.util.Collections;

public class BubbleSort {
    public ArrayList<Integer> sort(ArrayList<Integer> arraylist) {
        for (int i = 0; i < arraylist.size() - 1; i++) {
            boolean swap = false;
            for (int j = 0; j < arraylist.size() - 1 - i; j++) {
                if(arraylist.get(j) > arraylist.get(j + 1)) {
                    Collections.swap(arraylist, j, j + 1);
                    swap = true;
                }
            }
            if (swap == false) {
                break;
            }
        }
        return arraylist;
    }

    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        ArrayList<Integer> testData = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            testData.add((int)(Math.random() * 10));
        }

        // 데이터 3개일때 정렬
        arrayList.add(9);
        arrayList.add(2);
        arrayList.add(4);

        for (int i = 0; i < arrayList.size() - 1; i++) {
            Collections.swap(arrayList, i, i + 1);
        }
        System.out.println(arrayList);

        // 데이터가 n개일때
        BubbleSort bubble = new BubbleSort();
        System.out.println(bubble.sort(testData));
    }
}
