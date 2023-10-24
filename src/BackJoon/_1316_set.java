package BackJoon;

import java.io.*;
import java.util.HashSet;

public class _1316_set {

    static int groupWordChecker (String str) {
        HashSet<String> set = new HashSet<>();

        String word = str.substring(0, 1);

        for (int i = 1; i < str.length(); i++) {
            if (!word.equals(str.substring(i, i+1))) { // 저장되어 있는 word와 값이 다르면
                if (set.contains(word) || set.contains(str.substring(i, i+1))) { // 해당 저장 word및 다음값이 set에 저장 되어 있는지 확인
                    return 0; // 만약에 하나라도 있으면 return 0
                } else {
                    set.add(word); // 없으면 set에 추가
                    word = str.substring(i, i+1); // word를 새로운 단어로 ~
                }
            }

        }
        return 1; // 무사통과하면 return 1
    }

    public static void _1316_set(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int result = 0;

        for (int i = 0; i < N; i++) {
            String str = br.readLine();
            result += groupWordChecker(str);
        }

        bw.write(result + "\n");
        bw.flush();

    }

}
