package BackJoon;

import java.io.*;
import java.util.Arrays;

public class _10809 {
    public static void _10809(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String str = br.readLine();
        int[] result = new int[26]; // a ~ z
        Arrays.fill(result, -1);

        for (int i = 0; i < str.length(); i++) {
            if (result[str.charAt(i) - 'a'] == -1) {
                result[str.charAt(i) - 'a'] = i;
            }
        }

        for (int i = 0; i < 26; i++) {
            bw.write(result[i] + " ");
        }
        bw.write("\n");
        bw.flush();
    }
}
