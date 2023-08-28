import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;


public class Main {

//    public void Solution(String board[][]) {
//
//        for (int i = 0; i < board.length - 8; i++) {
//            for (int j = 0; j < board[0].length; j++) {
//                if ()
//            }
//        }
//
//    }

    public static void main(String[] args) throws IOException {
        Main T = new Main();
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int m = s.nextInt();

        String[][] cheseBoard = new String[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                cheseBoard[i][j] = s.next();
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(cheseBoard[i][j]);
            }
            System.out.println();
        }

    }
}
