package BackJoon;

import java.io.*;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class _18870 {

    public static void _18870(String[] args) throws IOException { // 30분
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // 버퍼리드 선언
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        StringTokenizer tokenizer = new StringTokenizer(br.readLine());

        // 1. 입력된 좌표를 작은 순으로 정렬한다.
        int[][] xs = new int[N][2]; // 0 : x, 1 : inputIndex
        for (int i = 0; i < N; i++) {
            xs[i][0] = Integer.parseInt(tokenizer.nextToken());
            xs[i][1] = i;
        }

        Arrays.sort(xs, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[0] - o2[0];
            }
        });

        // 2. 정렬된 좌표를 중복을 제거하며 압축된 인덱스를 기록한다.
        int[] ans = new int[N];
        int idx = 0; // 몇번째 인덱스인지

        ans[xs[0][1]] = idx;
        for (int i = 1; i < N; i++) {
            if (xs[i][0] != xs[i-1][0]) idx++;
            ans[xs[i][1]] = idx;
        }

        // 3. 입력된 좌표에 알맞은 압축 인덱스를 출력한다
        for (int i = 0; i < N; i++) {
            bw.write(ans[i] + " ");
        }
        bw.write("\n");
        bw.flush();
    }

}
