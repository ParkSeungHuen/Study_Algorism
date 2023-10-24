package BackJoon;

import java.io.*;

public class _2941 {

    public static void _2941(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String str = br.readLine();
        int count = 0;
        for (int i = 0; i < str.length();) {
            if (str.length() - i < 2) {
                count++;
                break;
            }

            String word = str.substring(i, i+2);
            if (word.equals("c=") || word.equals("c-") || word.equals("d-") || word.equals("lj")
                    || word.equals("nj") || word.equals("s=") || word.equals("z=")) {
                count++;
                i += 2;
            } else if (str.length() - i >= 3) {
                String word3 = str.substring(i, i+3);
                if (word3.equals("dz=")) {
                    count++;
                    i += 3;
                } else {
                    count++;
                    i++;
                }
            } else {
                count++;
                i++;
            }

        }

        bw.write(count + "\n");
        bw.flush();

    }

}
