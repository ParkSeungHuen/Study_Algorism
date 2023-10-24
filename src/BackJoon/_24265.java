package BackJoon;

import java.io.*;

public class _24265 {
    public static void _24265(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        long N = Long.parseLong(br.readLine()); // 입력 크기가 500000까지라서 자료형의 크기를 늘려주어야 함

        long count = 0;
        for (int i = 1; i <= N - 1; i++) { // n(n-1)/2와 같음;;
            count += i;
        }
        bw.write(count + "\n");
        bw.write("2" + "\n");
        bw.flush();

    }

}
