package ecount;

import java.util.Arrays;

public class RPermutation {
    public static int[] getMedianSequence(int[] arr) {
        int[] result = new int[arr.length];
        int[] sortedArr = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            sortedArr[i] = arr[i];
            Arrays.sort(sortedArr, 0, i + 1);

            int medianIndex = i / 2;
            result[i] = sortedArr[medianIndex];
        }
        return result;
    }

    public static void main(String[] args) {
        int[] input = {0, -1, -2, -3, -4};
        int[] output = getMedianSequence(input);
        System.out.println(Arrays.toString(output)); // prints [7, 7, 8]
    }


}
