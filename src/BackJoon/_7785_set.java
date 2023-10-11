package BackJoon;

import java.io.*;
import java.util.Set;
import java.util.StringTokenizer;
import java.util.TreeSet;

public class _7785_set {

    public static void _7785_set(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // 버퍼리드 선언
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        // HashSet과 TreeSet이 있다.
        // HashSet은 순서 미지향, TreeSet은 순서 지향
        // HashSet이 제공하는 함수의 시간복잡도는 거의 상수 시간, TreeSet은 NLogN
        Set<String> entered = new TreeSet<>(); // HashSet과

        for (int i = 0; i < N; i++) {
            StringTokenizer tokenizer = new StringTokenizer(br.readLine());
            String name = tokenizer.nextToken();
            String exit = tokenizer.nextToken();

            if (exit.equals("enter")) {
                entered.add(name);
            } else {
                entered.remove(name);
            }
        }

        String[] result = entered.toArray(new String[entered.size()]); // entered의 사이즈 만큼 배열을 추가해주기

        for (int i = result.length - 1; i >= 0; i--) { // 결과 역순 출력
            bw.write(result[i] + "\n");
        }

        bw.flush();
    }
}
