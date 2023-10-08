package BackJoon;

import java.io.*;

public class _2231 {

    public static void _2231(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // 버퍼리드 선언
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        boolean[] result = new boolean[1000000]; // 자연수의 크기는 1 ~ 1000000

        for (int i = 1; i < N; i++) { // 반복문은 입력받은 수 만큼 돌기
            int sum = i; // i = 생성자의 수, sum은 생성자로부터 만들어지는 분해합을 의미
            int num = i; // 분해합을 만들어줄 변수
            while (num > 0) { // 분해합 만들어주기
                sum = sum + num % 10; // 뒤 자리 수 부터 더해주기
                num /= 10; // 나누기
            }

            if (sum == N) { // 만약 구해진 분해합과 문제의 N과 같을 경우 result[i] true
                result[i] = true;
            }
        }

        for (int i = 0; i < result.length; i++) { // 가장 작은 생성자를 구하면 출력하고 break,
            if (result[i]) {
                bw.write(i + "\n");
                break;
            }else if (i == result.length - 1) { // 아무것도 true인 것이 없다면 0 출력
                bw.write(0 + "\n");
            }
        }

        bw.flush();
    }
}
