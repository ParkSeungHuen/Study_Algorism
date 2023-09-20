package BackJoon;

import java.io.IOException;
import java.util.Scanner;

public class _10989 {

    public static void _10989(String[] args) throws IOException {
        Scanner s = new Scanner(System.in);
        int P = s.nextInt();
        // O(P) * O(N^2)
        while (P-- > 0) {
            int T = s.nextInt();
            int[] h = new int[20];
            for (int i = 0; i < 20; i++) {
                h[i] = s.nextInt();
            }

            int result = 0;
            int[] sorted = new int[20];
            for (int i = 0; i < 20; i++) {
                // 1. 줄 서있는 학생 중에 자신보다 큰 학생 찾기, 없으면 줄 가장뒤 서기
                boolean find = false;

                for (int j = 0; j < i; j++) {
                    if (sorted[j] > h[i]) {
                        // 2. 찾았다면 그 학생의 앞에 서기
                        // 3. 뒤 학생들 모두 한칸씩 물러나기
                        find = true;
                        for (int k = i - 1; k >= j; k--) {
                            sorted[k + 1] = sorted[k];
                            result++;
                        }
                        sorted[j] = h[i];
                        break;
                    }
                }

                if(!find) {
                    sorted[i] = h[i];
                }
            }

            System.out.println(T + " " + result);
        }

        s.close();

    }

}
