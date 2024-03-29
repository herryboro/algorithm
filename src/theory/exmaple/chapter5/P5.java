package theory.exmaple.chapter5;

import java.util.Scanner;

public class P5 {
    static void recur(int n) {
        IntStack s = new IntStack(n);

        while (true) {
            if (n > 0) {
                s.push(n);
                n = n - 1;
                continue;
            }

            if (s.isEmpty() != true) {
                n = s.pop();
                System.out.println(n);
                n = n - 2;
                continue;
            }
            break;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("정수를 입력하세요: ");
        int i = sc.nextInt();
        recur(i);
    }
}
