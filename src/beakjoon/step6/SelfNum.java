package beakjoon.step6;

public class SelfNum {
    public int gaveInit(int n) {
        int sum = n;

        while (n != 0) {
            sum = sum + (n % 10);
            n = n / 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        SelfNum selfNum = new SelfNum();
        boolean[] booleans = new boolean[10001];
        StringBuilder sb = new StringBuilder();

        for (int i = 1; i < 10001; i++) {
            if (selfNum.gaveInit(i) < 10001) {
                booleans[selfNum.gaveInit(i)] = true;
            }
        }

        for (int i = 1; i < 10001; i++) {
            if (!booleans[i]) {
                sb.append(i).append("\n");
            }
        }
        System.out.println(sb);
    }
}



/*
    public static void main(String[] args) {
        boolean[] check = new boolean[10001];

        for (int i = 1; i < 10001; i++){
            int n = d(i);

            if(n < 10001){
                check[n] = true;
            }
        }

        StringBuilder sb = new StringBuilder();

        for (int i = 1; i < 10001; i++) {
            if (!check[i]) {
                sb.append(i).append('\n');
            }
        }
        System.out.println(sb);
    }

    static int d(int number) {
        int sum = number;

        while(number != 0){
            sum = sum + (number % 10);
            number = number/10;
        }
        return sum;
    }




    public int gaveInit(int n) {
        int sum = 0;

        while (n != 0) {
            sum = sum + (n % 10);
            n = n / 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        SelfNum selfNum = new SelfNum();
        Boolean[] booleans = new Boolean[10001];
        StringBuilder sb = new StringBuilder();

        for (int i = 1; i < 10001; i++) {
            if (selfNum.gaveInit(i) < 10001) {
                booleans[selfNum.gaveInit(i)] = true;
            }
        }

        for (int i = 1; i < 10001; i++) {
            if (!booleans[i]) {
                sb.append(i).append("\n");
            }
        }
        System.out.println(sb);
    }





    public static void main(String[] args) {
        boolean[] check = new boolean[10001];

        for (int i = 1; i < 10001; i++){
            int n = d(i);

            if(n < 10001){
                check[n] = true;
            }
        }

        List sb = new ArrayList();

        for (int i = 1; i < 10001; i++) {
            if (!check[i]) {
                sb.add(i);
            }
        }

        for (int i = 1; i < sb.size(); i++) {
            System.out.println(sb.get(i));
        }
    }

    static int d(int number) {
        int sum = number;

        while(number != 0) {
            sum = sum + (number % 10);
            number = number / 10;
        }
        return sum;
    }

 */





















