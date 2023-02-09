package infinflearnAlgorithm.sortPart;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class SelectSort {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];

        String[] s = br.readLine().split(" ");
        for(int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(s[i]);
        }

        int idx = 0;
        int temp = 0;

        for (int i = 0; i < n; i++) {
            idx = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[idx]) {
                    idx = j;
                }
            }

            temp = arr[i];
            arr[i] = arr[idx];
            arr[idx] = temp;
        }

        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
