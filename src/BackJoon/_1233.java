package BackJoon;

import java.io.*;
import java.util.StringTokenizer;

public class _1233 {

    public static void _1233(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // 버퍼리드 선언
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer tokenizer = new StringTokenizer(br.readLine());
        int s1 = Integer.parseInt(tokenizer.nextToken()); // 주사위 1
        int s2 = Integer.parseInt(tokenizer.nextToken()); // 주사위 2
        int s3 = Integer.parseInt(tokenizer.nextToken()); // 주사위 3

        // 최소 3, 최대는 세개의 주사위의 면 합
        int[] count = new int[s1 + s2+ s3 + 1]; // 배열의 인덱스는 주사위의 함을 의미

        for (int i = 1; i <= s1; i++) {
            for (int j = 1; j <= s2; j++) {
                for (int k = 1; k <= s3; k++) {
                    count[i + j + k]++;
                }
            }
        }

        int max = 0; // 인덱스
        int numMax = 0; // 크기
        for (int i = 0; i < count.length; i++) {
            if (count[i] > numMax) {
                max = i;
                numMax = count[i];
            }
        }

        bw.write(max + "\n");
        bw.flush();
    }
}
