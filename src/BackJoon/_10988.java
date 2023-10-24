package BackJoon;

import java.io.*;

public class _10988 {
    public static void _10988(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String str = br.readLine();
        if (str.length() > 1) {
            for (int i = 0; i < str.length() / 2; i++) { // 만약 level 단어가 들어올 경우 0번째와 4번째 인덱스, 1번째와 3번째 인덱스
                if (str.charAt(i) != str.charAt(str.length() - i - 1)) {
                    bw.write("0" + "\n");
                    break;
                }

                if (i == str.length() / 2 - 1) {
                    bw.write("1" + "\n");
                }
            }
        } else {
            bw.write("1" + "\n");
        }

        bw.flush();
    }

}
