package infinflearnAlgorithm.dynamicProgram;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

class Brick implements Comparable<Brick>{
    int area;
    int height;
    int weight;

    public Brick(int area, int height, int weight) {
        this.area = area;
        this.height = height;
        this.weight = weight;
    }

    @Override
    public int compareTo(Brick o) {
        return o.area - this.area;
    }
}

public class MostHeightTop {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        // memo
        int[] memo = new int[n];

        // 벽돌 list
        ArrayList<Brick> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String[] s = br.readLine().split(" ");
            list.add(new Brick(Integer.parseInt(s[0]), Integer.parseInt(s[1]), Integer.parseInt(s[2])));
        }
        // 넓이 기준으로 내림차순 정렬
        Collections.sort(list);

        memo[0] = list.get(0).height;
        int value = memo[0];

        for (int i = 1; i < n; i++) {
            int max = 0;

            for (int j = 0; j < i; j++) {
                if (list.get(j).weight > list.get(i).weight && max < memo[j]) {
                    max = memo[j];
                }
                memo[i] = max + list.get(i).height;
                value = Math.max(value, memo[i]);
            }
        }

        System.out.println(memo[memo.length-1]);
    }
}


