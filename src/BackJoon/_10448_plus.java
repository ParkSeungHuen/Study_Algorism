package BackJoon;

import java.io.*;

public class _10448_plus {
    static boolean[] isEurekaNumber = new boolean[1001];

    public static void preprocess() {
        // 1. K보다 작은 삼각수를 모두 구한다.
        int[] triangleNumbers = new int[50]; // 삼각수들의 모음집
        int triangleNumberCount = 0;
        for (int i = 1; ; i++) {
            int triangleNumber = i * (i + 1) / 2;
            if (triangleNumber >= 1000) break;
            triangleNumbers[triangleNumberCount++] = triangleNumber;
        }

        // 2. 구해진 삼각수 세개의 합으로 K를 나타낼 수 있는지 확인한다.
        boolean[] isSumOfTriangleNumber = new boolean[1001]; //

        for (int i = 0; i < triangleNumberCount; i++) {
            for (int j = 0; j < triangleNumberCount; j++) {
                int sum = triangleNumbers[i] + triangleNumbers[j];
                if (sum < 1000) isSumOfTriangleNumber[sum] = true;
            }
        }

        for (int i = 1; i < 1000; i++) {
            if (!isSumOfTriangleNumber[i]) continue; // 만약 두개의 삼각수로 표현할 수 없으면 false
            for (int j = 0; j < triangleNumberCount; j++) {
                int sum = i + triangleNumbers[j];
                if(sum <= 1000) isEurekaNumber[sum] = true;
            }
        }

    }
    public static void _10448_plus(String[] args) throws IOException { // 45분
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // 버퍼리드 선언
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        preprocess();

        // [3, 1000]
        // isEurekaNumber[]
        int T = Integer.parseInt(br.readLine());

        while (T-- > 0) {
            int k = Integer.parseInt(br.readLine());
            System.out.println(isEurekaNumber[k] ? "1" : "0");
        }

        bw.flush();

    }
}
