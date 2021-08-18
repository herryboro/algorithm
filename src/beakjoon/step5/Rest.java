package beakjoon.step5;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Rest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List list = new ArrayList<>();
        int[] var = new int[10];

        for (int i = 0; i < 10; i++) {
            var[i] = sc.nextInt();
            if(!list.contains(var[i] % 42)) {
                list.add(var[i] % 42);
            }
        }
        sc.close();

        System.out.println(list.size());
    }
}
