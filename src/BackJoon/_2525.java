package BackJoon;
import java.util.Scanner;

public class _2525 {
    public void Solution(int hour, int minute, int time) {
        int h = hour;
        int m =  minute + time;

        if (m >= 60) {
            h = h + m / 60;
            m = m % 60;
            if(h >= 24) {
                h = h % 24;
            }
        }

        System.out.println(h + " " + m);
    }


    public static void main(String[] args) {
        _2525 T = new _2525();
        Scanner s = new Scanner(System.in);
        int hour = s.nextInt();
        int minute = s.nextInt();
        int time = s.nextInt();

        T.Solution(hour, minute, time);

    }
}
