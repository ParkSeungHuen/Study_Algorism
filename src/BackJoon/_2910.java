package BackJoon;

import java.io.*;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class _2910 {

    static class Message {
        int num;
        int index;

        Message(int num, int index) {
            this.num = num;
            this.index = index;
        }
    }

    static class Frequency {
        int num;
        int count;
        int firstIndex;

        Frequency (int num, int count, int firstIndex) {
            this.num = num;
            this.count  = count;
            this.firstIndex = firstIndex;
        }
    }

    public static void _2910(String[] args) throws IOException { // 30분
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // 버퍼리드 선언
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer tokenizer = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(tokenizer.nextToken());
        int C = Integer.parseInt(tokenizer.nextToken());

        StringTokenizer tokenizer2 = new StringTokenizer(br.readLine());
        Message[] messages = new Message[N];
        // 1. 더 많이 등장한 숫자 먼저
        for (int i = 0; i < N; i++) {
            messages[i] = new Message(Integer.parseInt(tokenizer2.nextToken()), i);
        }

        Arrays.sort(messages, new Comparator<Message>() {
            @Override
            public int compare(Message o1, Message o2) {
                return o1.num - o2.num; // Tim sort이기 때문에 num끼리 같더라도 가장 먼저 들어온 index가 맨 앞에 있을 것임
            }
        });

        Frequency[] frequencies = new Frequency[N];
        int frequencyIndex = 0;
        frequencies[frequencyIndex] = new Frequency(messages[0].num, 1, messages[0].index); // 그 인덱스를 기록
        for (int i = 1; i < N; i++) {
            if (messages[i].num != messages[i-1].num) {
                frequencies[++frequencyIndex] = new Frequency(messages[i].num, 0, messages[i].index); // 최초로 맨 앞에 있는 index값 등록
            }
            frequencies[frequencyIndex].count++; // 만약 이전 숫자와 같으면 count++
        }

        Arrays.sort(frequencies, 0, frequencyIndex + 1, new Comparator<Frequency>() {
            @Override
            public int compare(Frequency o1, Frequency o2) {
                if (o1.count == o2.count) {
                    return o1.firstIndex - o2.firstIndex;
                }
                return o2.count - o1.count;
            }
        });

        for (int i = 0; i <= frequencyIndex; i++) { // 출력
            while (frequencies[i].count-- > 0) {
                bw.write(frequencies[i].num + " ");
            }
        }
        bw.write("\n");
        bw.flush();

    }

}
