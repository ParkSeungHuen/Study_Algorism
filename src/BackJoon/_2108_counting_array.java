package BackJoon;

import java.io.*;

public class _2108_counting_array {

    public static void _2108_counting_array(String[] args) throws IOException { // 30분
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // 버퍼리드 선언
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        // 카운팅 배열 사용
        int[] count = new int[8001]; // -4000 ~ 4000
        double sum = 0; // 산술 평균을 구하기 위한 합
        int max = -4001; // 범위를 구하기 위한 최댓값, 무조건 한번 갱신이 이루어져야 하므로
        int min = 4001; // 범위를 구하기 위한 최소값, 무조건 한번 갱신이 이루어져야 하므로

        for (int i = 0; i < N; i++) {
            int n = Integer.parseInt(br.readLine());
            count[n + 4000]++; // 입력 수 +4000
            if (n > max) {
                max = n;
            }

            if (n < min) {
                min = n;
            }

            sum += n;
        }

        int middle = 0;
        int judgementMiddle = 0;
        for (int i = 0; i <= 8000; i++) { // 중앙값, 카운팅 배열을 이용하여 카운트가 1 이상인 것들을 대상으로 판단
            if (count[i] > 0) {
                judgementMiddle += count[i]; // 카운팅 한 만큼 값 추가
                if (judgementMiddle >= (N+1)/2 && N > 1) { // 카운팅 인덱스가 절반을 넘어가면 해당 인덱스값을 중앙값이라 인식
                    middle = i - 4000;
                    break;
                } else if (N == 1) {
                    middle = i - 4000;
                }
            }
        }

        int modeNum = 0;
        int modeCount = 0;
        boolean modeNumSecondJudgement = false;
        for (int i = 0; i <= 8000; i++) {
            if (count[i] > modeCount) {
                modeNum = i - 4000;
                modeCount = count[i];
                modeNumSecondJudgement = false;
            } else if (modeCount == count[i]) { // 만약 카운트가 같으면 ? 숫자는 작은 수 부터 큰 수로 간다... 따라서 순차적으로
                // 증가하는 구조이므로 카운트가 같을 경우 modeNumSecondJudgement를 true로 만들어주고, 그 이후 새로운 큰 수가 올 경우
                // 다시 false로 만들어준다
                if (!modeNumSecondJudgement) {
                    modeNum = i - 4000;
                    modeCount = count[i];
                    modeNumSecondJudgement = true;
                }
            }

        }

        bw.write((int)Math.round(sum / N) + "\n"); // 산술평균
        bw.write(middle + "\n");// 중앙값
        bw.write(modeNum + "\n");// 최빈값
        bw.write(Math.abs(max - min) + "\n"); // 범위
        bw.flush();
    }

}
