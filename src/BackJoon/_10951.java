package BackJoon;

import java.io.*;
import java.util.StringTokenizer;

public class _10951 {
    public static void _10951(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // 버퍼리드 선언
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String str;

        while((str=br.readLine()) != null) {
            StringTokenizer tokenizer = new StringTokenizer(str);

            int a = Integer.parseInt(tokenizer.nextToken());
            int b = Integer.parseInt(tokenizer.nextToken());

            bw.write(a+b + "\n");
        }

        bw.flush();
    }

}
