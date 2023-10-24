package BackJoon;

import java.io.*;
import java.util.StringTokenizer;

public class _19532 {
    public static void _19532(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer tokenizer = new StringTokenizer(br.readLine());

        // ax + by = c를 만족하는 x,y값과 dx + ey = f를 만족하는 x,y값을 찾기
        int[] num = new int[6];

        for (int i = 0; i < 6; i++) {
            num[i] = Integer.parseInt(tokenizer.nextToken());
        }

        boolean checked = false; // 만약 좌표 찾았으면 탈출시키기

        for (int i = -999; i <= 999; i++) {
            for (int j = -999; j <= 999; j++) {
                if ((num[0] * i + num[1] * j) == num[2] && (num[3] * i + num[4] * j) == num[5]) {
                    bw.write(i + " ");
                    bw.write(j + "\n");
                    checked = true;
                    break;
                }
            }

            if (checked) {
                break;
            }
        }

        bw.flush();
    }
}
