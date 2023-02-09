package beakjoon.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
오리
 */

public class Dock {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String duck = br.readLine();

        if (duck.length() % 5 != 0) {
            System.out.println(-1);
        } else {
            boolean check = true;
            boolean[] visit = new boolean[duck.length()];
            int count = 0;

            while (true) {
                check = false;
                char c = 'q';
                for (int i = 0; i < duck.length(); i++) {
                    if (visit[i]) {
                        continue;
                    }
                    if (duck.charAt(i) == c) {
                        visit[i] = true;
                        if (c == 'k') {
                            check = true;
                        }
                        c = next(c);
                    }
                }

                if (check) {
                    count++;
                } else {
                    break;
                }
            }

            if (count == 0) {
                count = -1;
            } else {
                for (boolean b : visit) {
                    if (!b) {
                        count = -1;
                    }
                }
            }
            System.out.println(count);
        }

    }

    static char next(char c) {
        if (c == 'q') {
            return 'u';
        } else if (c == 'u') {
            return 'a';
        } else if (c == 'a') {
            return 'c';
        } else if (c == 'c') {
            return 'k';
        } else {
            return 'q';
        }
    }
}





/*
    import java.io.*;

public class Dock {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        int cnt = 0;
        int[] arr = new int[5];

        if (s.length() % 5 == 0) {
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == 'q') {
                    arr[0]++;
                    if(cnt != 0) {
                        cnt--;
                    }
                } else if (s.charAt(i) == 'u') {
                    arr[1]++;
                    if (arr[0] < arr[1]) {
                        cnt = -1;
                        break;
                    }
                } else if (s.charAt(i) == 'a') {
                    arr[2]++;
                    if (arr[1] < arr[2]) {
                        cnt = -1;
                        break;
                    }
                } else if (s.charAt(i) == 'c') {
                    arr[3]++;
                    if (arr[2] < arr[3]) {
                        cnt = -1;
                        break;
                    }
                } else if (s.charAt(i) == 'k') {
                    arr[4]++;
                    cnt++;
                    if (arr[3] < arr[4]) {
                        cnt = -1;
                        break;
                    }
                }
            }

            for (int i = 0; i < 5; i++) {
                if(cnt == -1) {
                    break;
                }
                for (int j = i + 1; j < 5; j++) {
                    if(arr[i] != arr[j]) {
                        cnt = -1;
                        break;
                    }
                }
            }
            System.out.print(cnt);
        } else {
            System.out.print(-1);
        }
    }
}






import java.io.*;
import java.util.*;

public class Dock {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        String word = sc.next();

        if (word.length() % 5 != 0) {
            System.out.println(-1);
            System.exit(0);
        }

        String dequeT = "quack";
        Deque<String> deque = new ArrayDeque<>();
        for (int i = 0; i < 5; i++) {
            deque.add(dequeT.substring(i, i + 1));
        }
        boolean[] bool = {false} * 5;
        ArrayList<String> visited = new ArrayList<>(Arrays.asList(false*10));


    }
}
 */