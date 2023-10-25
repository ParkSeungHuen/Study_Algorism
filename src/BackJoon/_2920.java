package BackJoon;

import java.io.*;
import java.util.StringTokenizer;

public class _2920 {
    public static void _2920(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer tokenizer = new StringTokenizer(br.readLine());
        String str = "";
        for (int i = 0; i < 8; i++) {
            str += tokenizer.nextToken();
        }
        if (str.equals("12345678")) {
            bw.write("ascending" + "\n");
        } else if (str.equals("87654321")) {
            bw.write("descending" + "\n");
        } else {
            bw.write("mixed" + "\n");
        }

        bw.flush();
    }
}
