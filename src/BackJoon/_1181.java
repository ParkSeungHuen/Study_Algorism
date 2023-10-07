package BackJoon;

import java.io.*;
import java.util.Arrays;
import java.util.Comparator;

public class _1181 {
    public static void _1181(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // 버퍼리드 선언
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine()); // 몇개 숫자를 입력받을 건지
        String[] strings = new String[N];
        Arrays.fill(strings, "");

        boolean re = false;

        for (int i = 0; i < N; i++) { // 값 입력받기, 중복을 먼저 제거하는 것 보다 정렬을 한 다음 출력할 때 단어의 앞 뒤를 비교해서 같으면 출력하지 않는 방법이 좋다.
            String str = br.readLine();
            for (int j = 0; j < i; j++) {
                if (strings[j].equals(str)) { // 만약 이전에 입력한 단어와 같은 단어가 있을 경우 추가하지 않는다
                    re = true;
                    break;
                }
            }
            if (!re) {
                strings[i] = str;
            }
            re = false;
        }

        Arrays.sort(strings, new Comparator<String>() { // 새로운 정렬 규칙 선언해주기, 이후 사용사 설정 형식일 때에 이를 사용하여 기준을 정해주기
            @Override
            public int compare(String o1, String o2) {
                if (o1.length() == o2.length()) { // 길이가 같으면 사전순으로, 시간복잡도가 nlogn에서 문자열의 길이 L 만큼, L * nlogn
                    return o1.compareTo(o2); // o2.compareTo(o1) : 사전 내림차순
                }
                return o1.length() - o2.length(); // 길이에 따른 오름차순, 반대로 하면 내림차순
            }
        });

        for (int i = 0; i < N; i++) {
            if (strings[i] != "") { // 공백을 제외하고 출력
                bw.write(strings[i] + "\n");
            }
        }

        bw.flush();
    }
}
