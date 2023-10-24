package BackJoon;

import java.io.*;
import java.util.StringTokenizer;

public class _5086 {
    public static void _5086(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        while (true) {
            StringTokenizer tokenizer = new StringTokenizer(br.readLine());
            int num1 = Integer.parseInt(tokenizer.nextToken());
            int num2 = Integer.parseInt(tokenizer.nextToken());

            if (num1 == 0 && num2 == 0) {
                break;
            }

            if (num1 > num2) {
                if (num1 % num2 == 0) {
                    bw.write("multiple" + "\n");
                } else {
                    bw.write("neither" + "\n");
                }
            } else {
                if (num2 % num1 == 0) {
                    bw.write("factor" + "\n");
                } else {
                    bw.write("neither" + "\n");
                }
            }

        }

        bw.flush();
    }
}
