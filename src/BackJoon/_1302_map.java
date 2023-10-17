package BackJoon;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class _1302_map {
    public static void _1302_map(String[] args) throws IOException { // 30분
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // 버퍼리드 선언
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        // HashMap, TreeMap 자료구조

        int N = Integer.parseInt(br.readLine());
        Map<String, Integer> titles = new HashMap<>();
        for (int i = 0; i < N; i++) {
            String title = br.readLine();
            titles.put(title, titles.getOrDefault(title, 0) + 1); // 타이틀이 없을 경우 getOrDefault를 이용하여 새로운 값 추가
        } // 시간복잡도 : N * LlogN, logN은 get할 떄 배열 순회

        String maxTitle = "";
        int maxCount = 0;
        for(Map.Entry<String, Integer> title : titles.entrySet()) {
            String titleName = title.getKey();
            int count = title.getValue();

            if (count > maxCount || (count == maxCount && titleName.compareTo(maxTitle) < 0)) { // 만약 카운트가 같으면 사전순으로
                maxTitle = titleName;
                maxCount = count;
            }
        }

        bw.write(maxTitle + "\n");

        bw.flush();
    }
}
