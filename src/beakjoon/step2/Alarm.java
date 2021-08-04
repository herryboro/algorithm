package beakjoon.step2;

import java.util.Scanner;

public class Alarm {
    public static void main(String[] args) {
        Scanner var = new Scanner(System.in);
        String timeStr = var.nextLine();
        var.close();

        String[] timeMin = timeStr.split(" ");
        int time = Integer.parseInt(timeMin[0]);
        int min = Integer.parseInt(timeMin[1]);

        if(min < 45) {
            if(time > 0) {
                time = time - 1;
            } else {
                time = 23;
            }
            min = min + 60 - 45;
        } else {
            min = min - 45;
        }
        System.out.println(time + " " + min);
    }
}
