package BackJoon;

import java.io.*;

public class _8958 {
    public static void _8958(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            String str = br.readLine();
            int result = 0;
            int count = 0;
            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(j) == 'O') {
                    count++;
                    result += count;
                } else {
                    count = 0;
                }
            }

            bw.write(result + "\n");
        }

        bw.flush();
    }
}
