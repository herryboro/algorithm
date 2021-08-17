package theory.practice.chapter2;

public class Q2 {
    public static void main(String[] args) {
        int temp = 0;
        int[] a = new int[] {22, 57, 11, 32, 91, 68, 70};

        for (int i = 0; i < a.length / 2; i++) {
            System.out.println("a[" + i + "]과 a[" + (a.length - (i+1)) + "]를 교환합니다.");
            temp = a[i];
            a[i] = a[a.length - (i+1)];
            a[a.length  - (i+1)] = temp;

            for (int j = 0; j < a.length; j++) {
                System.out.print(a[j] + " ");
            }
            System.out.println();
        }
    }
}

//static void sumOf(int[] a) {
//        int sum = 0;
//        for (int i = 0; i < a.length; i++) {
//            sum += a[i];
//        }
//        System.out.println("배열 int[] a의 모든 요소의 합: " + sum);
//    }
