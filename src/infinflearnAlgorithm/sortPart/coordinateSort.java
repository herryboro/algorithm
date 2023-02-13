package infinflearnAlgorithm.sortPart;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

class Point implements Comparable<Point> {
    int x, y = 0;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public int compareTo(Point p) {
        if (this.x == p.x) {
            return this.y - p.y;
        } else {
            return this.x - p.x;
        }
    }
}

public class coordinateSort {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // 좌표수
        int n = Integer.parseInt(br.readLine());

        // Point 객체 정렬
        ArrayList<Point> PointList = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String[] s = br.readLine().split(" ");
            int x = Integer.parseInt(s[0]);
            int y = Integer.parseInt(s[1]);

            PointList.add(new Point(x, y));
        }

        Collections.sort(PointList);
        for (Point point : PointList) {
            System.out.println(point.x + " " + point.y);
        }
    }
}
