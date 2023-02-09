package theory.algorithm.mergesort;

import java.util.ArrayList;

public class Merge {
    public void split(ArrayList<Integer> dataList) {
        if (dataList.size() <= 1) {
            return;
        }

        ArrayList<Integer> leftArr = new ArrayList<Integer>(dataList.subList(0, dataList.size() / 2));
        ArrayList<Integer> rightArr = new ArrayList<Integer>(dataList.subList(dataList.size() / 2, dataList.size()));

        System.out.println("leftArr = " + leftArr);
        System.out.println("rightArr = " + rightArr);
    }

    public ArrayList<Integer> mergeSplitFunc(ArrayList<Integer> dataList) {
        if (dataList.size() <= 1) {
            return dataList;
        }
        int medium = dataList.size() / 2;

        ArrayList<Integer> leftArr;
        ArrayList<Integer> rightArr;

        leftArr = mergeSplitFunc(new ArrayList<Integer>(dataList.subList(0, medium)));
        rightArr = mergeSplitFunc(new ArrayList<Integer>(dataList.subList(medium, dataList.size())));

        return mergeFunc(leftArr, rightArr);
    }

    public ArrayList<Integer> mergeFunc(ArrayList<Integer> leftList, ArrayList<Integer> rightList) {
        ArrayList<Integer> mergeList = new ArrayList<>();
        int leftPoint = 0;
        int rightPoint = 0;

        // case1: left / rigth둘다 있을때
        while (leftList.size() > leftPoint && rightList.size() > rightPoint) {
            if (leftList.get(leftPoint) > rightList.get(rightPoint)) {
                mergeList.add(rightList.get(rightPoint));
                rightPoint += 1;
            } else {
                mergeList.add(leftList.get(leftPoint));
                leftPoint += 1;
            }
        }
        // CASE2: right 데이터가 없을 때
        while (leftList.size() > leftPoint) {
            mergeList.add(leftList.get(leftPoint));
            leftPoint += 1;
        }

        // CASE3: left 데이터가 없을 때
        while (rightList.size() > rightPoint) {
            mergeList.add(rightList.get(rightPoint));
            rightPoint += 1;
        }

        return mergeList;
    }

    public static void main(String[] args) {
        ArrayList<Integer> testData = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            testData.add((int) (Math.random() * 10));
        }
        System.out.println("testData = " + testData);

        Merge merge = new Merge();
        System.out.println(merge.mergeSplitFunc(testData));
    }
}
