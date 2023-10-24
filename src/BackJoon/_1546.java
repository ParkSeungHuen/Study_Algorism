package BackJoon;

import java.io.*;
import java.util.StringTokenizer;

public class _1546 {

    public static void _1546(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        double M = 0;
        StringTokenizer tokenizer = new StringTokenizer(br.readLine());

        double[] score = new double[N];
        for (int i = 0; i < N; i++) {
            score[i] = Integer.parseInt(tokenizer.nextToken());
            if (score[i] >= M) {
                M = score[i];
            }
        }

        double sum = 0;

        for (int i = 0; i < N; i++) {
            sum += score[i] / M * 100;
        }

        bw.write(sum / N + "\n");
        bw.flush();


    }

}
