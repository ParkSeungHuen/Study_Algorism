package BackJoon;

import java.io.*;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class _11005 {
    public static void _11005(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // 버퍼리드 선언
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer tokenizer = new StringTokenizer(br.readLine());

        int num = Integer.parseInt(tokenizer.nextToken());
        int B = Integer.parseInt(tokenizer.nextToken());
        ArrayList<Integer> arrayList = new ArrayList<>();

        while (num > 0) {
            arrayList.add((num % B));
            num = num / B;
        }

        for (int i = arrayList.size() - 1; i >= 0; i--) {
            if(arrayList.get(i) > 9) {
                System.out.print((char)(arrayList.get(i) + 55));
            } else {
                System.out.print(arrayList.get(i));
            }
        }

        bw.flush();

    }
}
