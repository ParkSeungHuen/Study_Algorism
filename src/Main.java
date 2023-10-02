import java.io.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException { // 45분, 이동은 구현했지만 + 변환 등은 하지 못함, 인강 ㄱㄱ
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // 버퍼리드 선언
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int size = Integer.parseInt(br.readLine()); // 크기 입력받기

        char[][] chars = new char[size][size]; // 배열 선언

        for (int i = 0; i < chars.length; i++) {
            for (int j = 0; j < chars.length; j++) {
                chars[i][j] = (char)46; // .
            }
        }

        String drive = br.readLine();
        int x = 0; // x좌표
        int y = 0; // y좌표

        for (int i = 0; i < drive.length(); i++) { // 입력받은 문자의 길이
            String c = drive.substring(i,i+1);

            switch (c) { // case 4가지 :  위쪽 이동 'U', 아래쪽으로 이동은 'D', 왼쪽으로 이동은 'L', 오른쪽으로 이동은 'R'

                case "R":
                    if (x != size) {
                        chars[y][x] = (char)45;
                        x++;
                    }
                    break;

                case "L":
                    if (x != 0) {
                        chars[y][x] = (char)45;
                        x--;
                    }
                    break;

                case "D":
                    if (y != size) {
                        chars[y][x] = (char)124; // |
                        y++;
                    }
                    break;

                case "U":
                    if (y != 0) {
                        chars[y][x] = (char)124; // |
                        y--;
                    }
                    break;

            }
        }

        for (int i = 0; i < chars.length; i++) {
            for (int j = 0; j < chars.length; j++) {
                System.out.print(chars[i][j]);
            }
            System.out.println();
        }

        bw.flush();

    }
}
