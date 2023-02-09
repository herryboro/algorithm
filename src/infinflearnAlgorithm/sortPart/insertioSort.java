package infinflearnAlgorithm.sortPart;
import java.util.Scanner;

public class insertioSort {
    public int[] solution(int n, int[] arr) {
        for(int i = 1; i < n; i++) {
            int tmp = arr[i];
            int j = 0;
            for(j = i - 1; j >= 0; j--) {
                if(arr[j] > tmp) {
                    arr[j+1] = arr[j];
                } else {
                    break;
                }
            }
            arr[j + 1] = tmp;
        }
        return arr;
    }
    public static void main(String[] args){
        insertioSort T = new insertioSort();
        Scanner kb = new Scanner(System.in);
        int n=kb.nextInt();
        int[] arr=new int[n];
        for(int i=0; i<n; i++) arr[i]=kb.nextInt();
        for(int x : T.solution(n, arr)) System.out.print(x+" ");
    }

//    public static void main(String[] args) throws Exception {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        int n = Integer.parseInt(br.readLine());
//        int[] arr = new int[n];
//
//        String[] s = br.readLine().split(" ");
//        for(int i = 0; i < n; i++) {
//            arr[i] = Integer.parseInt(s[i]);
//        }
//
//        for (int i = 1; i < arr.length; i++) {
//            int temp = arr[i];
//
//            for (int j = i; j > 0; j--) {
//                if (temp < arr[j-1]) {
//                    arr[j] = arr[j-1];
//                } else {
//                    arr[j] = temp;
//                    break;
//                }
//
//                if(j == 1) {
//                    arr[0] = temp;
//                }
//            }
//        }
//
//        for (int i = 0; i < arr.length; i++) {
//            System.out.print(arr[i] + " ");
//        }
//    }
}
