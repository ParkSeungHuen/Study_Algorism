package BackJoon;

import java.io.*;
import java.util.*;

public class _2910_linked_hash_map {

    public static void _2910_linked_hash_map(String[] args) throws IOException { // 30분
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // 버퍼리드 선언
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer tokenizer = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(tokenizer.nextToken());
        int C = Integer.parseInt(tokenizer.nextToken());

        StringTokenizer tokenizer2 = new StringTokenizer(br.readLine());
        Map<Integer, Integer> map = new LinkedHashMap<>(); // 빈도를 세기 위한 맵, 맵에 추가되는 순서가 저장되는 LinkedHashMap 이용

        // 1. 더 많이 등장한 숫자 먼저
        for (int i = 0; i < N; i++) {
            int message = Integer.parseInt(tokenizer2.nextToken());
            map.put(message, map.getOrDefault(message, 0) + 1);
        }

        Integer[] frequencies = map.keySet().toArray(new Integer[map.size()]); // 맵의 키를 배열화 시켜서 맵의 사이즈 만큼 가져온다
        Arrays.sort(frequencies, new Comparator<Integer>() { // 이미 먼저 들어온 순서대로 정렬됨, 따로 정렬하지 않아도 자동으로 먼저 들어온 순서대로 저장
            @Override
            public int compare(Integer o1, Integer o2) {
                return map.get(o2) - map.get(o1); // 맵의 카운트에 따라 정렬
            }
        });

        for (int frequency : frequencies) {
            int count = map.get(frequency);
            while (count-- > 0) {
                bw.write(frequency + " ");
            }
        }
        bw.write("\n");
        bw.flush();

    }

}
