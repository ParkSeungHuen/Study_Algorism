package BackJoon;

import java.io.*;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class _7785 {

    public static class ConfirmPeople {
        String name;
        String exit;

        ConfirmPeople (String name, String exit){
            this.name = name;
            this.exit = exit;
        }
    }

    public static void _7785(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // 버퍼리드 선언
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        ConfirmPeople[] confirmPeople = new ConfirmPeople[N];

        for (int i = 0; i < N; i++) {
            StringTokenizer tokenizer = new StringTokenizer(br.readLine());
            confirmPeople[i] = new ConfirmPeople(tokenizer.nextToken(), tokenizer.nextToken());
        }

        Arrays.sort(confirmPeople, new Comparator<ConfirmPeople>() { // 먼저 역순으로 정렬을 한다
            @Override
            public int compare(ConfirmPeople o1, ConfirmPeople o2) {
                return o2.name.compareTo(o1.name);
            }
        });


        String[] result = new String[N];
        Arrays.fill(result, "");
        for (int i = 0; i < N - 1; i++) {
            if (!confirmPeople[i].name.equals(confirmPeople[i + 1].name)) {
                // 정렬을 하면 자기 이름끼리 모여있을 것.
                // 앞 뒤 비교하여 다를 때 enter, leave 판단 후 enter 면 추가

                if (confirmPeople[i].exit.equals("enter")) {
                    result[i] = confirmPeople[i].name; // 이름 추가
                }

            }

            if (i == N - 2) { // 마지막것까지 판단해주기
                if (confirmPeople[i + 1].exit.equals("enter")) {
                    result[i + 1] = confirmPeople[i + 1].name;
                }
            }
        }

        for (int i = 0; i < N; i++) {
            if (result[i] != "") {
                bw.write(result[i] + "\n");
            }
        }

        // 시간복잡도 : 입력 N, 정렬 NlogN, 계산 N, 출력 N, 시간복잡도 O(NLogN)
        // 힌트 후 30분
        bw.flush();
    }
}
