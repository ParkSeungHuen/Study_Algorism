package BackJoon;

import java.io.*;
import java.util.StringTokenizer;

public class _1120 {

    public static void _1120(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // 버퍼리드 선언
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer tokenizer = new StringTokenizer(br.readLine());
        String A = tokenizer.nextToken();
        String B = tokenizer.nextToken();

        // 1. B보다 항상 길이가 작은 A를 순차적으로 비교해서 차이가 가장 큰 것으로..
        int min = 50; // 최대 길이 50이므로
        for (int i = 0; i < B.length() - A.length() + 1; i++) {
            int count = 0;

            for (int j = 0; j < A.length(); j++) {
                if (A.charAt(j) != B.charAt(j + i)) {
                    count++;
                }
            }

            min = Math.min(min, count);
        }

        bw.write(min + "\n");
        bw.flush();
    }
}
