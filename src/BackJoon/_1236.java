package BackJoon;

import java.io.IOException;
import java.util.Scanner;

public class _1236 {

    public static void _1236(String[] args) throws IOException {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt(); // y좌표
        int m = s.nextInt(); // x좌표

        char[][] castle = new char[n][m];
        boolean[] castleX = new boolean[n];
        boolean[] castleY = new boolean[m];

        int xResult = n;
        int yResult = m;

        for (int i = 0; i < n; i++) {
            castle[i] = s.next().toCharArray();
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if(castle[i][j] == 'X') {
                    castleX[i] = true;
                    castleY[j] = true;
                }
            }
        }

        for (int i = 0; i < n; i++) {
            if(castleX[i] == true) {
                xResult--;
            }
        }

        for (int i = 0; i < m; i++) {
            if(castleY[i] == true) {
                yResult--;
            }
        }

        if(xResult > yResult) {
            System.out.println(xResult);
        } else {
            System.out.println(yResult);
        }

        s.close();

    }
}
