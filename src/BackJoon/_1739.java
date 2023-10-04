package BackJoon;

import java.io.*;

public class _1739 {
    public static void _1739(String[] args) throws IOException { // 45분
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // 버퍼리드 선언
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine()); // 크기 입력받기
//        String command = sc.hasNext() ? sc.next() : ""; // hasNext() : 읽어들일 값이 있는 경우 sc.next(), 없을 경우 ""

        String drive = br.readLine();
        int x = 0; // x좌표
        int y = 0; // y좌표

        boolean[][] passVertical = new boolean[N][N];
        boolean[][] passHorizontal = new boolean[N][N];

        for (int i = 0; i < drive.length(); i++) { // 입력받은 문자의 길이
            String c = drive.substring(i,i+1);

            switch (c) { // case 4가지 :  위쪽 이동 'U', 아래쪽으로 이동은 'D', 왼쪽으로 이동은 'L', 오른쪽으로 이동은 'R'
                case "R":
                    if (x == N-1) continue;
                    passHorizontal[y][x] = passHorizontal[y][x+1] = true;
                    x++;
                    break;

                case "L":
                    if (x == 0) continue;
                    passHorizontal[y][x] = passHorizontal[y][x-1] = true;
                    x--;
                    break;

                case "D":
                    if (y == N-1) continue;
                    passVertical[y][x] = passVertical[y+1][x] = true; // y와 y+1 궤적 그리기
                    y++;
                    break;

                case "U":
                    if (y == 0) continue;
                    passVertical[y][x] = passVertical[y-1][x] = true;
                    y--;
                    break;

            }
        }

        for (int i = 0; i < N; i++) {
            String ans = "";
            for (int j = 0; j < N; j++) {
                if(passVertical[i][j] && passHorizontal[i][j]) ans += "+";
                else if (passVertical[i][j]) ans += "|";
                else if (passHorizontal[i][j]) ans += "-";
                else ans += ".";
            }
            System.out.println(ans);
        }

        bw.flush();

    }
}
