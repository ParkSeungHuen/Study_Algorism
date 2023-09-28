package BackJoon;

import java.io.*;
import java.util.Arrays;

public class _2309 {
    public static void _2309(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // 버퍼리드 선언
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] array = new int[9];
        int sum = 0;

        for (int i = 0; i < 9; i++) {
            int n = Integer.parseInt(br.readLine());
            array[i] = n;
            sum += n;
        }

        for (int i = 0; i < 8; i++) { // 마지막 배열의 8번쨰와 9번쨰를 비교하고 끝날 것이기 떄문에 i = 8
            for (int j = i + 1; j < 9; j++) { // 항상 i보다 뒤에있는 배열과 비교함
                if (sum - (array[i] + array[j]) == 100) {
                    array[i] = 0; // 비교해서 100이 될 경우 해당 배열의 수를 0으로 바꾸고
                    array[j] = 0;
                    Arrays.sort(array); // 정렬한 다음
                    for (int k = 2; k < 9; k++) {
                        System.out.println(array[k]); // 출력
                    }
                    return;
                }
            }
        }

        bw.flush();

    }
}
