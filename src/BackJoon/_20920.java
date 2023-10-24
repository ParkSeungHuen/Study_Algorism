package BackJoon;

import java.io.*;
import java.util.*;

public class _20920 {

    static class Word {
        String str;
        int count;
        Word(String str, int count) {
            this.str = str;
            this.count = count;
        }
    }

    public static void _20920(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer tokenizer = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(tokenizer.nextToken()); // 단어 입력수
        int M = Integer.parseInt(tokenizer.nextToken()); // 이거보다 짧은 글자수의 단어는 그냥 외움

        HashMap<String, Integer> wordMap = new HashMap<>();

        for (int i = 0; i < N; i++) {
            String str = br.readLine();
            if (str.length() >= M) {
                wordMap.put(str, wordMap.getOrDefault(str, 0) + 1); // 단어가 없을 경우 새로 추가
            }
        }

        Word[] result = new Word[wordMap.size()];
        int i = 0;
        for (Map.Entry<String, Integer> word : wordMap.entrySet()) { // 맵 순환하기, 커스텀 타입 배열 저장
            result[i] = new Word(word.getKey(), word.getValue());
            i++;
        }

        Arrays.sort(result, new Comparator<Word>() {
            @Override
            public int compare(Word o1, Word o2) {
                if (o1.count == o2.count) { // 자주 나온 단어순으로 출력, 단어가 같으면 단어 길이가 긴 순서로
                    if (o1.str.length() == o2.str.length()) { // 단어 길이가 긴 순서로 먼저 출력, 단어 길이가 같으면 사전 순
                        return o1.str.compareTo(o2.str);
                    } else {
                        return o2.str.length() - o1.str.length();
                    }
                }
                return o2.count - o1.count;
            }
        });

        for (int j = 0; j < wordMap.size(); j++) {
            bw.write(result[j].str + "\n");
        }
        bw.flush();
    }
}
