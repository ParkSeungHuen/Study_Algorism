package BackJoon;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class _11399 {

    public static void _11399(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        StringTokenizer tokenizer = new StringTokenizer(br.readLine());

        int[] wait = new int[N];
        for (int i = 0; i < N; i++) {
            wait[i] = Integer.parseInt(tokenizer.nextToken()); // 기다려야 하는 분 입력
        }

        Arrays.sort(wait);

        int sum = 0;
        int count = 0;
        for (int i = 0; i < N; i++) {
            count += wait[i];
            sum += count;
        }

        bw.write(sum + "\n");
        bw.flush();
    }

}
