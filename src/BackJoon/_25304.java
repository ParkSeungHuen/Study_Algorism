package BackJoon;

import java.io.*;
import java.util.StringTokenizer;

public class _25304 {
    public static void _25304(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int price = Integer.parseInt(br.readLine());
        int N = Integer.parseInt(br.readLine());
        int result = 0;

        for (int i = 0; i < N; i++) {
            StringTokenizer tokenizer = new StringTokenizer(br.readLine());
            result += Integer.parseInt(tokenizer.nextToken()) * Integer.parseInt(tokenizer.nextToken());
        }

        if (result == price) {
            bw.write("Yes" + "\n");
        } else {
            bw.write("No" + "\n");
        }

        bw.flush();
    }

}
