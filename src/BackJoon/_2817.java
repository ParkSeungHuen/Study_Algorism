package BackJoon;

import java.io.*;
import java.util.StringTokenizer;

public class _2817 {

    static class Score {
        int staffIndex;
        double scr;

        Score(int staffIndex, double scr) {
            this.staffIndex = staffIndex;
            this.scr = scr;
        }
    }

    public static void sortScoresDescendingOrder(Score[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < i; j++) {
                if (arr[i].scr > arr[j].scr) {
                    Score cur = arr[i];

                    for (int k = i; k > j; k--) {
                        arr[k] = arr[k - 1];
                    }

                    arr[j] = cur;
                }
            }
        }
    }

    public static void _2817(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // 버퍼리드 선언
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int X = Integer.parseInt(br.readLine()); // 총 몇명의 참가자 ?
        int N = Integer.parseInt(br.readLine()); // 총 몇명의 스태프 ?
        int[] staffs = new int[26];

        // 1. 전체 득표수의 5% 미만의 스태프를 후보에서 제외한다.
        double validCut = X * 0.05; // 5%이상 투표 받아야 함
        boolean[] validCandidate = new boolean[26]; // 알파벳 A ~ Z
        int[] staffVote = new int[26]; // 각 스태프별 득표 수
        int candidateCount = 0;

        for (int i = 0; i < N; i++) {
            StringTokenizer tokenizer = new StringTokenizer(br.readLine());
            char staff = tokenizer.nextToken().charAt(0); // 스태프 알파벳
            int vote = Integer.parseInt(tokenizer.nextToken()); // 스태프 투표수

            if (vote >= validCut) {
                int index = staff - 'A';
                validCandidate[index] = true;
                staffVote[index] = vote;
                candidateCount++;
            }
        }

        // 2. 남은 스태프마다 받은 득표수를 1~14로 나눈 점수 집합을 구한다.
        Score[] scores = new Score[candidateCount * 14];
        int scoreIndex = 0;
        for (int i = 0; i < 26; i++) {
            if (validCandidate[i]) {
                for (int j = 1; j <= 14; j++) {
                    scores[scoreIndex++] = new Score(i, (double)staffVote[i] / j);
                }
            }
        }

        // 3. 전체 점수 집합에서 점수가 큰 1~14번째 스태프에게 칩을 1개씩 지급한다.
        sortScoresDescendingOrder(scores); // 정렬해서 1~14번째 수

        int[] ans = new int[26];
        for (int i = 0; i < 14; i++) {
            ans[scores[i].staffIndex]++;
        }
        // 4. 스태프 이름에 대해 사전순으로 후보 스태프와 받은 칩의 수를 출력한다.
        for (int i = 0; i < 26; i++) {
            if (validCandidate[i]) {
                bw.write((char)(i + 'A') + " " + ans[i] + "\n");
            }
        }

        // 시간복잡도 : O((validateCount * 14)^2)

        bw.flush();
    }
}
