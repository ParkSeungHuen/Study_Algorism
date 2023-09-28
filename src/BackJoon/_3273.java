package BackJoon;

import java.io.*;
import java.util.StringTokenizer;

public class _3273 {

    public static void _3273(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // 버퍼리드 선언
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int[] array = new int[N];
        int result = 0;

        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] count = new int[1000000]; // 0 ~ 99999, 1 ~ 100000

        for (int i = 0; i < N; i++) {
            array[i] = Integer.parseInt(st.nextToken());
            count[array[i] - 1]++;
        }

        int x = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            int pairValue = x - array[i];
            if (1 <= pairValue && pairValue < 100000) {
                if (count[pairValue - 1] != 0) {
                    result += count[pairValue-1];
                }

            }
        }

        System.out.println(result / 2); // 중복되는 쌍이 하나씩 더 생김, 모든 입력 숫자가 다르다는 가정이 있기 때문에 이렇게 가능

        bw.flush();

    }
}
