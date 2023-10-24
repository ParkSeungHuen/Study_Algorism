package BackJoon;

import java.io.*;
import java.util.StringTokenizer;

public class _11047 {
    public static void _11047(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer tokenizer = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(tokenizer.nextToken());
        int money = Integer.parseInt(tokenizer.nextToken());

        int[] moneyValue = new int[N];
        for (int i = N - 1; i >= 0; i--) {
            moneyValue[i] = Integer.parseInt(br.readLine());
        }

        int count = 0;
        for (int i = 0; i < N; i++) {
            if (money / moneyValue[i] != 0) {
                count += money / moneyValue[i];
                money %= moneyValue[i];
            }
        }

        bw.write(count + "\n");
        bw.flush();
    }

}
