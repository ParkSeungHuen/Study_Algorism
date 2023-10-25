package BackJoon;

import java.io.*;
import java.util.StringTokenizer;

public class _2675 {
    public static void _2675(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            StringTokenizer tokenizer = new StringTokenizer(br.readLine());
            int R = Integer.parseInt(tokenizer.nextToken());
            String str = tokenizer.nextToken();

            for (int j = 0; j < str.length(); j++) {
                for (int k = 0; k < R; k++) {
                    bw.write(str.charAt(j));
                }
            }
            bw.write("\n");

        }
        bw.flush();
    }
}
