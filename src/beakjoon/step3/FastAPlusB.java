package beakjoon.step3;

import java.io.*;

public class FastAPlusB {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int cnt = Integer.parseInt(br.readLine());
        String[] arrayInt = new String[cnt];

        for(int i = 0; i < cnt; i++) {
            String s = br.readLine();
            String[] numStr = s.split(" ");

            int firstNum = Integer.parseInt(numStr[0]);
            int secondNum = Integer.parseInt(numStr[1]);
            arrayInt[i] = Integer.toString(firstNum + secondNum);
        }
        br.close();

        for (int i = 0; i < arrayInt.length; i++) {
            bw.write(arrayInt[i]);
            bw.newLine();
        }
        bw.flush();
        bw.close();
    }
}

// 풀이1 : 시간초과
//    long before = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
//
//    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//    int cnt = Integer.parseInt(br.readLine());
//    int[] arrayInt = new int[cnt];
//
//        for(int i = 0; i < cnt; i++) {
//        String s = br.readLine();
//        String[] numStr = s.split(" ");
//
//        int firstNum = Integer.parseInt(numStr[0]);
//        int secondNum = Integer.parseInt(numStr[1]);
//        arrayInt[i] = firstNum + secondNum;
//        }
//        br.close();
//
//        for (int i = 0; i < arrayInt.length; i++) {
//        System.out.println(arrayInt[i]);
//        }
//
//        System.gc();
//        long after  = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
//        long usedMemory = (before - after)/1024/1024;
//
//        System.out.println("Used Memory : " + usedMemory);
//        long heapSize = Runtime.getRuntime().maxMemory();
//        System.out.println(heapSize/1024/1024);

// 풀이2. 시간초과
//BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//    int cnt = Integer.parseInt(br.readLine());
//    List list = new ArrayList();
//
//        for (int i = 0; i < cnt; i++) {
//        String s = br.readLine();
//        String[] numStr = s.split(" ");
//
//        int num = Integer.parseInt(numStr[0]) + Integer.parseInt(numStr[1]);
//        list.add(num);
//        }
//        br.close();
//
//        for (int i = 0; i < list.size(); i++) {
//        System.out.println(list.get(i));
//        }