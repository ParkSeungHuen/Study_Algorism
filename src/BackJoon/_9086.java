package BackJoon;

import java.io.*;

public class _9086 {
    public static void _9086(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            String str = br.readLine();
            char startWord = str.charAt(0);
            char endWord = str.charAt(str.length()-1);
            bw.write(startWord);
            bw.write(endWord + "\n");
        }

        bw.flush();
    }
}
