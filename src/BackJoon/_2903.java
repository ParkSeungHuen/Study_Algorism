package BackJoon;

import java.io.*;
import java.util.StringTokenizer;

public class _2903 {
    public static void _2903(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int sum = 1;

        for (int i = 0; i < N; i++) {
            sum *= 2;
        }

        sum++;

        bw.write(sum * sum + "\n");
        bw.flush();
    }
}
