package BackJoon;

import java.io.*;

public class _4673 {

    public static void _4673(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // 버퍼리드 선언
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        boolean[] result = new boolean[10001];
        for (int i = 1; i < result.length; i++) {
            // i는 셀프넘버인지 판단하려고 하는 수

            for (int j = 1; j < i; j++) { // 셀프 넘버 판정, i보다 크기가 작게 됨
                int sum = j; // j숫자로부터 만들어지는 분해합
                int num = j; // 생성자 만들기 위함

                while (num > 0) {
                    sum += num % 10;
                    num /= 10;
                } // 분해합 구하기

                if (sum == i) { // 만약 구해진 분해합이 i와 같다면 i는 셀프넘버가 아니게 된다
                    result[i] = true; // 그러면 i는 셀프넘버가 아니다 = true
                }

            }

        }

        for (int i = 1; i < result.length; i++) { // false만 출력
            if (!result[i]) {
                bw.write(i + "\n");
            }
        }

        bw.flush();
    }
}
