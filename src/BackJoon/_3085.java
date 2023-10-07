package BackJoon;

import java.io.*;

public class _3085 {
    public static int findMaxRow(char[][] map) {
        int N = map.length;
        int maxRow = 0;

        for (int r = 0; r < N; r++) {
            int len = 1;

            for (int c = 1; c < N; c++) {
                if (map[r][c] == map[r][c - 1]) len++;
                else {
                    maxRow = Math.max(maxRow, len);
                    len = 1;
                }
            }
            maxRow = Math.max(maxRow, len);
        }

        return maxRow;
    }

    public static int findMaxColumn (char[][] map) {
        int N = map.length;
        int maxColumn = 0;

        for (int c = 0; c < N; c++) {
            int len = 1;

            for (int r = 1; r < N; r++) {
                if(map[r][c] == map[r-1][c]) len++;
                else {
                    maxColumn = Math.max(maxColumn, len);
                    len = 1;
                }
            }
            maxColumn = Math.max(maxColumn, len);
        }

        return maxColumn;
    }

    public static void swapCandy(char[][] map, int r1, int c1, int r2, int c2) {
        char temp = map[r1][c1];
        map[r1][c1] = map[r2][c2];
        map[r2][c2] = temp;
    }

    public static void _3085(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // 버퍼리드 선언
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine()); // 배열의 크기
        char[][] map = new char[N][N];
        for (int i = 0; i < N; i++) {
            String candy = br.readLine();
            for (int j = 0; j < candy.length(); j++) {
                map[i][j] = candy.charAt(j);
            }
        }

        int ans = 0;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (j + 1 < N && map[i][j] != map[i][j+1]) {
                    swapCandy(map, i, j, i, j+1);
                    ans = Math.max(ans, Math.max(findMaxColumn(map), findMaxRow(map)));
                    swapCandy(map, i, j, i, j+1);
                }

                if (i + 1 < N && map[i][j] != map[i+1][j]) {
                    swapCandy(map, i, j, i+1, j);
                    ans = Math.max(ans, Math.max(findMaxColumn(map), findMaxRow(map)));
                    swapCandy(map, i, j, i+1, j);
                }
            }
        }

        System.out.println(ans);

        bw.flush();
    }
}
