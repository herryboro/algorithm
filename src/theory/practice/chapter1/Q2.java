package theory.practice.chapter1;

public class Q2 {
    static int min3(int a, int b, int c) {
        int min = a;
        if (b < a) {
            min = b;
        }
        if (min > c) {
            min = c;
        }
        return min;
    }

    public static void main(String[] args) {
        System.out.println(min3(2, 4, 10));
    }
}
