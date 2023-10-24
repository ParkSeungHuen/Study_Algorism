package BackJoon;

import java.io.*;
import java.util.StringTokenizer;

public class _2501 {

    public static void _2501(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer tokenizer = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(tokenizer.nextToken());
        int K = Integer.parseInt(tokenizer.nextToken());

        int count = 0;
        int resultNum = 0;
        for (int i = 1; i <= N; i++) {
            if (N % i == 0) {
                count++;
                if (count == K) {
                    resultNum = i;
                    break;
                }
            }
        }

        bw.write(resultNum + "\n");
        bw.flush();

    }

}
