package BackJoon;

import java.io.*;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class _18870_timeout {

    public static class Coordinate {
        int x;
        int inputIndex;

        Coordinate(int x, int inputIndex) {
            this.x = x;
            this.inputIndex = inputIndex;
        }
    }

    public static void _18870_timeout(String[] args) throws IOException { // 타임아웃 이유 : bufferedWriter 사용하면 안남, 시간복잡도 : O(NlogN), 틀림
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // 버퍼리드 선언
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        StringTokenizer tokenizer = new StringTokenizer(br.readLine());

        Coordinate[] result = new Coordinate[N];
        for (int i = 0; i < N; i++) {
            result[i] = new Coordinate(Integer.parseInt(tokenizer.nextToken()), i);
        }

        Arrays.sort(result, new Comparator<Coordinate>() {
            @Override
            public int compare(Coordinate o1, Coordinate o2) {
                return o1.x - o2.x; // 일단 수의 오름차순으로 정렬
            }
        });

        int count = 0; // 번호 매기기
        for (int i = 0; i < result.length - 1; i++) {
            if (result[i].x != result[i+1].x) {
                result[i] = new Coordinate(count, result[i].inputIndex);
                count++;
            } else {
                result[i] = new Coordinate(count, result[i].inputIndex);
            }

            if (i == result.length - 2) {
                if (result[i].x != result[i+1].x) {
                    result[i+1] = new Coordinate(count, result[i+1].inputIndex);
                }
            }
        }
        Arrays.sort(result, new Comparator<Coordinate>() {
            @Override
            public int compare(Coordinate o1, Coordinate o2) {
                return o1.inputIndex - o2.inputIndex;
            }
        });

        for (int i = 0; i < N; i++) {
            bw.write(result[i].x + " ");
        }
        bw.write("\n");
        bw.flush();

    }

}
