package BackJoon;

import java.io.IOException;
import java.util.Scanner;

public class _10158 { // 제한시간이 너무 짧으면 시간복잡도를 충족했음에도 불구하고 정답처리가 안되는 경우가 있음
    // buffer 사용하기

    public static void _10158(String[] args) throws IOException {
        Scanner s = new Scanner(System.in);
        int plateX = s.nextInt();
        int plateY = s.nextInt();
        int startEntX = s.nextInt();
        int startEntY = s.nextInt();
        int time = s.nextInt();

        int movingX = (time + startEntX) % plateX;
        int movingY = (time + startEntY) % plateY;

        // x축 부딫힌 횟수가 짝수일 때 +, 홀수일 때 -
        if(((time + startEntX) / plateX) % 2 == 1) {
            startEntX = plateX - movingX;
        } else {
            startEntX = movingX;
        }

        // y축 부딫힌 횟수가 짝수일 때 +, 홀수일 때 -
        if(((time + startEntY) / plateY) % 2 == 1) {
            startEntY = plateY - movingY;
        } else {
            startEntY = movingY;
        }

        System.out.printf("%d %d", startEntX, startEntY);

        s.close();

    }
}
