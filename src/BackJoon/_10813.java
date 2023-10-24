package BackJoon;

import java.io.*;
import java.util.StringTokenizer;

public class _10813 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer tokenizer = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(tokenizer.nextToken());
        int M = Integer.parseInt(tokenizer.nextToken());

        int[] pocket = new int[N];

        for (int i = 0; i < N; i++) {
            pocket[i] = i + 1;
        }

        for (int i = 0; i < M; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int one = Integer.parseInt(st.nextToken()) - 1; // tmp에 two 저장 -> two에 one 저장 -> one에 tmp(two)저장
            int two = Integer.parseInt(st.nextToken()) - 1;
            int tmp = pocket[two];
            pocket[two] = pocket[one];
            pocket[one] = tmp;
        }

        for (int i = 0; i < N; i++) {
            bw.write(pocket[i] + " ");
        }
        bw.write("\n");
        bw.flush();
    }

}
