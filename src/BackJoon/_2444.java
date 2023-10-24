package BackJoon;

import java.io.*;

public class _2444 {

    public static void _2444(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // 2 * N - 1
        int N = Integer.parseInt(br.readLine());
        // 만약 N = 5, * 최대 개수 11, 중간값 6
        // 공백 후 별의 개수만큼 * append, 공백 -1
        int star = 1;
        int space = N - 1;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < space; j++) {
                bw.write(" ");
            }
            for (int j = 0; j < star; j++) {
                bw.write("*");
            }
            star += 2;
            space--;
            bw.write("\n");
        }

        star = star - 4;
        space = space + 2;

        for (int i = 0; i < N - 1; i++) {
            for (int j = 0; j < space; j++) {
                bw.write(" ");
            }
            for (int j = 0; j < star; j++) {
                bw.write("*");
            }
            star -= 2;
            space++;
            bw.write("\n");
        }
        bw.write("\n");
        bw.flush();

    }

}
