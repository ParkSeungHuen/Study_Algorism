package BackJoon;

import java.io.*;
import java.util.StringTokenizer;

public class _2798 {

    public static void _2798(String[] args) throws IOException { // 30분
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // 버퍼리드 선언
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer tokenizer = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(tokenizer.nextToken());
        int M = Integer.parseInt(tokenizer.nextToken());
        // 세개 합이 3을 넘지 않는다 ??
        StringTokenizer stringTokenizer = new StringTokenizer(br.readLine());
        int[] num = new int[N];

        for (int i = 0; i < N; i++) {
            num[i] = Integer.parseInt(stringTokenizer.nextToken());
        }

        int result = 0;
        int judgement = M;

        for (int i = 0; i < num.length; i++) { // 중복 없이 가야한다
            for (int j = i+1; j < num.length; j++) {
                for (int k = j+1; k < num.length; k++) {
                    int sum = num[i] + num[j] + num[k];

                    if(Math.abs(sum - M) < judgement && sum <= M) {
                        result = sum;
                        judgement = Math.abs(sum - M);
                    }
                }
            }
        }

        bw.write(result + "\n");
        bw.flush();

    }

}
