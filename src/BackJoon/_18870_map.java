package BackJoon;

import java.io.*;
import java.util.*;

public class _18870_map {
    public static void _18870_map(String[] args) throws IOException { // 30분
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // 버퍼리드 선언
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        StringTokenizer tokenizer = new StringTokenizer(br.readLine());

        // 1. 입력된 좌표를 작은 순으로 정렬한다.
        int[] xs = new int[N];
        Set<Integer> set = new TreeSet<>(); // 작은 순서 유지용 treeset
        for (int i = 0; i < N; i++) {
            xs[i] = Integer.parseInt(tokenizer.nextToken());
            set.add(xs[i]);
        }

        // 2. 정렬된 좌표를 중복을 제거하며 압축된 인덱스를 기록한다.
        Map<Integer, Integer> sortedIndex = new HashMap<>();
        int idx = 0;
        for (int x : set) { // 중복이 제거된 x값에 새로운 idx 부여
            sortedIndex.put(x, idx++);
        }
        // 3. 입력된 좌표에 알맞은 압축 인덱스를 출력한다

        for (int i = 0; i < N; i++) {
            bw.write(sortedIndex.get(xs[i]) + " "); // 해당 키 값의 idx를 출력해주는 것으로
        }

        bw.write("\n");
        bw.flush();

    }
}
