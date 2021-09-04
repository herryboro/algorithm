package beakjoon.step6;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class SelfNum {
    public static void main(String[] args) {
        List list = new ArrayList();

        for (int i = 1; i < 10002; i++) {
            list.add(i + (i / 10) + (i % 10));
        }
        HashSet hashSet = new HashSet(list);
        ArrayList arrayList = new ArrayList<>(hashSet);

        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println(arrayList.get(i));
        }
        for (int i = 1; i < 10002; i++) {
            if(!arrayList.contains(i)) {
                System.out.println(i);
            }
        }
    }
}























