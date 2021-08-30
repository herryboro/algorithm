package beakjoon.step5;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Rest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List list = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            int num = sc.nextInt();
            if(!list.contains(num % 42)) {
                list.add(num % 42);
            }
        }
        sc.close();

        System.out.println(list.size());
    }
}
