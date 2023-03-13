package beakjoon.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class CardNumber2_sliver4 {
    /**
     *  Hashmap 풀이
     */

//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        // n, 상근이 카드
//        int n = Integer.parseInt(br.readLine());
//        int[] card = new int[n];
//        String[] s = br.readLine().split(" ");
//        for (int i = 0; i < n; i++) {
//            card[i] = Integer.parseInt(s[i]);
//        }
//
//        // HashMap
//        HashMap<Integer, Integer> map = new HashMap<>();
//        for (int cardNum : card) {
//            map.put(cardNum, map.getOrDefault(cardNum, 0) + 1);
//        }
//
//        int m = Integer.parseInt(br.readLine());
//        s = br.readLine().split(" ");
//        int[] CardCnt = new int[m];
//        StringBuilder sb = new StringBuilder();
//
//        for (int i = 0; i < m; i++) {
//            sb.append(map.getOrDefault(Integer.parseInt(s[i]), 0));
//            sb.append(" ");
//        }
//
//        System.out.println(sb);
//    }
    /**
     *  이분탐색 풀이
     */
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for(int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr);

        int M = Integer.parseInt(br.readLine());

        st = new StringTokenizer(br.readLine()," ");
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < M; i++) {
            int key = Integer.parseInt(st.nextToken());

            // upperBound와 lowerBound의 차이 값을 구한다.
            sb.append(upperBound(arr, key) - lowerBound(arr, key)).append(' ');
        }
        System.out.println(sb);
    }

    private static int lowerBound(int[] arr, int key) {
        int lo = 0;
        int hi = arr.length - 1;

        // lo가 hi랑 같아질 때 까지 반복
        while (lo <= hi) {

            int mid = (lo + hi) / 2; // 중간위치를 구한다.

            /*
             *  key 값이 중간 위치의 값보다 작거나 같을 경우
             *
             *  (중복 원소에 대해 왼쪽으로 탐색하도록 상계를 내린다.)
             */
            if (key <= arr[mid]) {
                hi = mid - 1;
            }

            else {
                lo = mid + 1;
            }

        }

        return lo;
    }

    private static int upperBound(int[] arr, int key) {
        int lo = 0;
        int hi = arr.length - 1;

        // lo가 hi랑 같아질 때 까지 반복
        while (lo <= hi) {

            int mid = (lo + hi) / 2; // 중간위치를 구한다.

            // key값이 중간 위치의 값보다 작을 경우
            if (key < arr[mid]) {
                hi = mid - 1;
            }
            // 중복원소의 경우 else에서 처리된다.
            else {
                lo = mid + 1;
            }
        }

        return lo;
    }
}
