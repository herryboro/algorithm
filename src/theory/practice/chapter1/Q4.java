package theory.practice.chapter1;

public class Q4 {
    static int cen(int a, int b, int c) {
        int cen = 0;

        if (a >= b) {
            if (b >= c) {
                cen = b;
            } else if (a <= c) {
                cen = a;
            } else {
                cen = c;
            }
        } else if (a >= c) {        // b가 a보다 큰 상황
            cen = a;
        } else if (b > c) {         // c가 a보다 큼
            cen = c;
        } else {                    // c가 제일큼
            cen = b;
        }
        return cen;
    }

    public static void main(String[] args) {
        System.out.println("med3(3,2,1) = " + cen(3, 2, 1)); // a＞b＞c
        System.out.println("med3(3,2,2) = " + cen(3, 2, 2)); // a＞b＝c
        System.out.println("med3(3,1,2) = " + cen(3, 1, 2)); // a＞c＞b
        System.out.println("med3(3,2,3) = " + cen(3, 2, 3)); // a＝c＞b
        System.out.println("med3(2,1,3) = " + cen(2, 1, 3)); // c＞a＞b
        System.out.println("med3(3,3,2) = " + cen(3, 3, 2)); // a＝b＞c
        System.out.println("med3(3,3,3) = " + cen(3, 3, 3)); // a＝b＝c
        System.out.println("med3(2,2,3) = " + cen(2, 2, 3)); // c＞a＝b
        System.out.println("med3(2,3,1) = " + cen(2, 3, 1)); // b＞a＞c
        System.out.println("med3(2,3,2) = " + cen(2, 3, 2)); // b＞a＝c
        System.out.println("med3(1,3,2) = " + cen(1, 3, 2)); // b＞c＞a
        System.out.println("med3(2,3,3) = " + cen(2, 3, 3)); // b＝c＞a
        System.out.println("med3(1,2,3) = " + cen(1, 2, 3)); // c＞b＞a
    }
}


// 책 풀이
/*
    static int med3(int a, int b, int c) {
        if (a >= b)
            if (b >= c)
                return b;
            else if (a <= c)
                return a;
            else
                return c;
        else if (a > c)
            return a;
        else if (b > c)
            return c;
        else
            return b;
    }

    public static void main(String[] args) {
        System.out.println("med3(3,2,1) = " + med3(3, 2, 1)); // a＞b＞c
        System.out.println("med3(3,2,2) = " + med3(3, 2, 2)); // a＞b＝c
        System.out.println("med3(3,1,2) = " + med3(3, 1, 2)); // a＞c＞b
        System.out.println("med3(3,2,3) = " + med3(3, 2, 3)); // a＝c＞b
        System.out.println("med3(2,1,3) = " + med3(2, 1, 3)); // c＞a＞b
        System.out.println("med3(3,3,2) = " + med3(3, 3, 2)); // a＝b＞c
        System.out.println("med3(3,3,3) = " + med3(3, 3, 3)); // a＝b＝c
        System.out.println("med3(2,2,3) = " + med3(2, 2, 3)); // c＞a＝b
        System.out.println("med3(2,3,1) = " + med3(2, 3, 1)); // b＞a＞c
        System.out.println("med3(2,3,2) = " + med3(2, 3, 2)); // b＞a＝c
        System.out.println("med3(1,3,2) = " + med3(1, 3, 2)); // b＞c＞a
        System.out.println("med3(2,3,3) = " + med3(2, 3, 3)); // b＝c＞a
        System.out.println("med3(1,2,3) = " + med3(1, 2, 3)); // c＞b＞a
    }

 */

/*
    내풀이

    static int cen(int a, int b, int c) {
        int cen = 0;

        if (a >= b) {
            if (b >= c) {
                cen = b;
            } else if (a <= c) {
                cen = a;
            } else {
                cen = c;
            }
        } else if (a >= c) {        // b가 a보다 큰 상황
            cen = a;
        } else if (c > a && c < b) {
            cen = c;
        } else {
            cen = b;
        }
        return cen;
    }

    public static void main(String[] args) {
        System.out.println("med3(3,2,1) = " + cen(3, 2, 1)); // a＞b＞c
        System.out.println("med3(3,2,2) = " + cen(3, 2, 2)); // a＞b＝c
        System.out.println("med3(3,1,2) = " + cen(3, 1, 2)); // a＞c＞b
        System.out.println("med3(3,2,3) = " + cen(3, 2, 3)); // a＝c＞b
        System.out.println("med3(2,1,3) = " + cen(2, 1, 3)); // c＞a＞b
        System.out.println("med3(3,3,2) = " + cen(3, 3, 2)); // a＝b＞c
        System.out.println("med3(3,3,3) = " + cen(3, 3, 3)); // a＝b＝c
        System.out.println("med3(2,2,3) = " + cen(2, 2, 3)); // c＞a＝b
        System.out.println("med3(2,3,1) = " + cen(2, 3, 1)); // b＞a＞c
        System.out.println("med3(2,3,2) = " + cen(2, 3, 2)); // b＞a＝c
        System.out.println("med3(1,3,2) = " + cen(1, 3, 2)); // b＞c＞a
        System.out.println("med3(2,3,3) = " + cen(2, 3, 3)); // b＝c＞a
        System.out.println("med3(1,2,3) = " + cen(1, 2, 3)); // c＞b＞a
    }
 */
