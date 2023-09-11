package BackJoon;

import java.io.IOException;
import java.util.Scanner;

public class _10158_plus {

    public static void _10158_plus(String[] args) throws IOException {
        Scanner s = new Scanner(System.in);
        int plateX = s.nextInt();
        int plateY = s.nextInt();
        int startEntX = s.nextInt();
        int startEntY = s.nextInt();
        int time = s.nextInt();

        int currentX = (time + startEntX) % (2 * plateX);
        int currentY = (time + startEntY) % (2 * plateY);

        if (currentX > plateX) currentX = 2 * plateX - currentX;
        if (currentY > plateY) currentY = 2 * plateY - currentY;

        System.out.printf("%d %d", currentX, currentY);

        s.close();

    }
}
