package theory.algorithm.recursivecall;

import java.util.ArrayList;

public class RecursiveCall {

    public int factorial(int num) {
        if (num > 1) {
            return num * factorial(num - 1);
        } else {
            return 1;
        }
    }

    public int factorial2(int num) {
        if(num <= 1) {
            return 1;
        }
        return num * factorial2(num - 1);
    }

    public int factorial3(ArrayList<Integer> dataList) {
        if (dataList.size() <= 0) {
            return 0;
        } else {
            return dataList.get(0) + factorial3(new ArrayList<Integer>(dataList.subList(1 , dataList.size())));
        }
    }

    public int factorial4(int n) {
        if (n == 1) {
            return 1;
        } else if(n == 2) {
            return 2;
        } else if (n == 3) {
            return 4;
        } else {
            return factorial4(n - 1) + factorial4(n - 2) + factorial4(n - 3);
        }
    }

    public static void main(String[] args) {
        // 팩토리얼
        ArrayList<Integer> testData = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            testData.add(i);
        }

        RecursiveCall recursiveCall = new RecursiveCall();
//        System.out.println(recursiveCall.factorial(3));
//        System.out.println(recursiveCall.factorial2(10));
        System.out.println(recursiveCall.factorial3(testData));
//        System.out.println(recursiveCall.factorial4(5));
    }
}
