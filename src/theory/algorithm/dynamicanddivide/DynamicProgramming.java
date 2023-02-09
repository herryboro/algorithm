package theory.algorithm.dynamicanddivide;

public class DynamicProgramming {
    public int fibonacci(int num) {
        if (num == 0) {
            return 0;
        } else if (num == 1) {
            return 1;
        } else {
            return fibonacci(num - 1) + fibonacci(num - 2);
        }
    }

    public int dynamicFunc(int data) {
        Integer[] cache = new Integer[data + 1];
        cache[0] = 0;
        cache[1] = 1;

        for (int i = 2; i < data + 1; i++) {
            cache[i] = cache[i - 1] + cache[i - 2];
        }
        return cache[data];
    }

    public static void main(String[] args) {
        DynamicProgramming dp = new DynamicProgramming();
        System.out.println(dp.fibonacci(4));
        System.out.println(dp.dynamicFunc(5));
    }
}
