package BackJoon;

import java.io.*;
import java.util.Arrays;

public class _2751 {
    public static void _2751(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // 버퍼리드 선언
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine()); // 몇개 숫자를 입력받을 건지
        Integer[] integers = new Integer[N];

        for (int i = 0; i < N; i++) {
            integers[i] = Integer.parseInt(br.readLine());
        }
        // Array.sort 에서 시간복잡도는 primitive 자료형(int, double, boolean 등)은 double quick sort를 사용해서 시간복잡도가 평균 nlogn, 최악 n^2
        // 다른 wrapper 클래스나 사용자 지정 타입 같은 경우 Tim sort를 사용하여 시간복잡도가 평균 최악 둘다 nlogn이 된다.
        // 이렇게 사용하는 타입에 따라 사용하는 알고리즘이 다르기 때문에 잘 알아보고 라이브러리를 사용하면 된다.
        // quick sort 시리즈들은 추가적인 메모리를 사용하지 않는다는 장점이 있다. 따라서 경우에 따라 적절한 알고리즘을 사용하는 라이브러리를 사용하면 된다
        Arrays.sort(integers);

        for (int i = 0; i < N; i++) {
            bw.write(integers[i] + "\n"); // \n 사용
        }

        bw.flush();
    }
}
