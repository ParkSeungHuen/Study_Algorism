package BackJoon;

import java.io.*;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class _2108_timeout {

    static class IntCount {
        int key;
        int count;

        IntCount (int key, int count) {
            this.key = key;
            this.count = count;
        }
    }

    public static void _2108_timeout(String[] args) throws IOException { // 30분
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // 버퍼리드 선언
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        HashMap<Integer, Integer> map = new HashMap<>();
        int max = -4000;
        int min = 4000;
        double sum = 0;
        int[] middle = new int[N];
        for (int i = 0; i < N; i++) {
            int num = Integer.parseInt(br.readLine());
            map.put(num, map.getOrDefault(num, 0) + 1);
            middle[i] = num;
            sum += num;

            if (num > max) {
                max = num;
            } else  if (num < min) {
                min = num;
            }
        }

        int maxCount = 0;

        IntCount[] intCount = new IntCount[map.size()];
        int i = 0;
        for (Map.Entry<Integer, Integer> series : map.entrySet()) { // 최빈값 중에서도 작은 값을 저장
            intCount[i] = new IntCount(series.getKey(), series.getValue());
            i++;
        }

        Arrays.sort(intCount, new Comparator<IntCount>() {
            @Override
            public int compare(IntCount o1, IntCount o2) {
                if (o2.count == o1.count) {
                    return o1.key - o2.key;
                }
                return o2.count - o1.count;
            }
        });

        int maxCountNum;

        if (intCount.length == 1) {
            maxCountNum = intCount[0].key;
        } else {
            maxCountNum = intCount[0].count == intCount[1].count ? intCount[1].key : intCount[0].key;
        }

        Arrays.sort(middle);

        bw.write(Math.round(sum / N) == 0 ? "0" + "\n" : Math.round(sum / N) + "\n"); // 산술평균
        bw.write(middle[(N-1)/2] + "\n"); // 중앙값
        bw.write(maxCountNum + "\n"); // 최빈값
        bw.write(Math.abs(max - min) + "\n"); // 범위
        bw.flush();

    }
}
