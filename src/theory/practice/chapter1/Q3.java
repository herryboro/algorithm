package theory.practice.chapter1;

public class Q3 {
    static int min3(int a, int b, int c, int d) {
        int min = a;
        if (b < a) {
            min = b;
        }
        if (min > c) {
            min = c;
        }
        if (min > d) {
            min = d;
        }
        return min;
    }

    public static void main(String[] args) {
        System.out.println(min3(55, 4, 10, 3));
    }
}
