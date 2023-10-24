package BackJoon;

import java.io.*;

public class _2839 {
    public static void _2839(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        if (N == 4 || N == 7) { // N == 4거나 7일 경우는 성립 x
            bw.write(-1 + "\n");
        } else if (N % 5 == 0) { // 5kg과 딱맞아 떨어질 경우 최소
            bw.write(N / 5 + "\n");
        } else if (N % 5 == 1 || N % 5 == 3) { // 11일 경우 5kg 1개, 3kg 2개 // 13일 경우 5kg 2개, 3kg 1개
            bw.write(N / 5 + 1 + "\n");
        } else if (N % 5 == 2 || N % 5 == 4) { // 12일 경우 3kg 4개 // 14일 경우 3kg 3개 1kg 1개
            bw.write(N / 5 + 2 +"\n");
        }
        bw.flush();
    }

}
