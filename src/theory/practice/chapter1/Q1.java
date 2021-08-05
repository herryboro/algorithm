package theory.practice.chapter1;

public class Q1 {
    static int max4(int a, int b, int c, int d) {
        int max = a;
        if (a < b) {
            max = b;
        }
        if (max < c) {
            max = c;
        }
        if (max < d) {
            max = d;
        }
        return max;
    }

    public static void main(String[] args) {
        System.out.println(max4(2, 4, 10, 1));
    }
}


