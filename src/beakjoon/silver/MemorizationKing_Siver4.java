package beakjoon.silver;


import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;

public class MemorizationKing_Siver4 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < t; i++) {
            // note1 필기장
            int n = Integer.parseInt(br.readLine());
            ArrayList<Integer> list = new ArrayList<>();
            int[] arr = new int[n];
            String[] line = br.readLine().split(" ");

            for (int j = 0; j < n; j++) {
                arr[j] = Integer.parseInt(line[j]);
            }
            Arrays.sort(arr);

            // note2 필기장
            int m = Integer.parseInt(br.readLine());
            line = br.readLine().split(" ");

            for (int j = 0; j < m; j++) {
                int num = Integer.parseInt(line[j]);
                int index = Arrays.binarySearch(arr, num);

                if (index >= 0) {
                    sb.append("1\n");
                } else {
                    sb.append("0\n");
                }
            }
        }
        System.out.print(sb.toString());
    }
}
