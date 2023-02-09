package theory.algorithm.sapcecomplexity;

public class Factorial {
    public int factorial(int n) {
        if (n > 1) {
            return n * factorial(n - 1);
        } else {
            return 1;
        }
    }

    public static void main(String[] args) {
        Factorial ft = new Factorial();
        System.out.println(ft.factorial(4));
    }
}
