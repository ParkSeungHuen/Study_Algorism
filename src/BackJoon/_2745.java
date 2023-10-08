package BackJoon;

import java.io.*;
import java.util.StringTokenizer;

public class _2745 {

    public static void _2745(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // 버퍼리드 선언
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer tokenizer = new StringTokenizer(br.readLine());

        String num = tokenizer.nextToken(); // 7
        int B = Integer.parseInt(tokenizer.nextToken()); // 8

        int[] nums = new int[num.length()]; // 1칸짜리 배열

        for (int i = 0; i < num.length(); i++) {
            if (num.charAt(i) >= 'A' && num.charAt(i) <= 'Z') {
                nums[i] = num.charAt(i) - 'A' + 10;
            } else {
                nums[i] = Integer.parseInt(num.substring(i, i+1));
            }
        }

        int sum = 0;
        int count = 1;

        for (int i = 0; i < nums.length; i++) { // 자릿수 만큼 반복문,
            for (int j = 0; j < nums.length - i - 1; j++) { // 35^4 ~ 35^0
                count *= B;
            }
            sum = sum + nums[i] * count; // 더해주기
            count = 1; // 카운트 초기화
        }

        bw.write(sum + "\n");
        bw.flush();
    }
}
