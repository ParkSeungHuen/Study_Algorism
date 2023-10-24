package BackJoon;

import java.io.*;
import java.util.StringTokenizer;

public class _2480 {

    public static void _2480(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer tokenizer = new StringTokenizer(br.readLine());

        int num1 = Integer.parseInt(tokenizer.nextToken());
        int num2 = Integer.parseInt(tokenizer.nextToken());
        int num3 = Integer.parseInt(tokenizer.nextToken());

        int result = 0;
        if (num1 == num2 && num2 == num3) {
            result = 10000 + num1 * 1000;
        } else if (num1 != num2 && num2 != num3 && num1 != num3) {
            result = Math.max(Math.max(num1, num2), num3) * 100;
        } else {
            if (num1 == num2 || num1 == num3) {
                result = 1000 + num1 * 100;
            } else if (num2 == num3) {
                result = 1000 + num2 * 100;
            }
        }

        bw.write(result + "\n");
        bw.flush();
    }

}
