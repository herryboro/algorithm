package beakjoon.silver;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class MemorizationKing_Siver4 {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        int t = Integer.parseInt(br.readLine());
//
//        for(int a=0; a<t; a++) {
//            Set<Integer> set = new HashSet<>();
//            StringBuilder sb = new StringBuilder();
//            int n = Integer.parseInt(br.readLine());
//
//            StringTokenizer st = new StringTokenizer(br.readLine());
//            for(int i=0; i<n; i++)
//                set.add(Integer.parseInt(st.nextToken()));
//
//            int m = Integer.parseInt(br.readLine());
//            st = new StringTokenizer(br.readLine());
//
//            for(int i=0; i<m; i++) {
//                if (set.contains(Integer.parseInt(st.nextToken()))) {
//                    sb.append(1).append("\n");
//                } else {
//                    sb.append(0).append("\n");
//                }
//            }
//            System.out.println(sb);
//        }
//    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < t; i++) {
            // note1 필기장
            int n = Integer.parseInt(br.readLine());
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
                boolean found = false;
                int left = 0;
                int right = arr.length - 1;

                while (left <= right) {
                    int mid = (left + right) / 2;

                    if (arr[mid] == num) {
                        found = true;
                        break;
                    } else if (arr[mid] < num) {
                        left = mid + 1;
                    } else {
                        right = mid - 1;
                    }
                }

                if (found) {
                    sb.append("1\n");
                } else {
                    sb.append("0\n");
                }
            }
        }

        System.out.print(sb.toString());
    }
}
