package BackJoon;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class _2840 {

    public static void _2840(String[] args) throws IOException { // 45분
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // 버퍼리드 선언
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer tokenizer = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(tokenizer.nextToken()); // 바퀴의 칸수
        int K = Integer.parseInt(tokenizer.nextToken()); // 몇번 돌릴건지

        char[] wheel = new char[N]; // 바퀴의 칸 수 만큼 배열 선언
        Arrays.fill(wheel, '?'); // ?로 채우기
        int curIndex = 0; // 화살표

        while (K-- > 0) {
            StringTokenizer stringTokenizer = new StringTokenizer(br.readLine());
            int step = Integer.parseInt(stringTokenizer.nextToken()); // 몇칸 이동 할 건지
            char nextAlphabet = stringTokenizer.nextToken().charAt(0); // 알파벳 무엇인지
            // 화살표는 가만히 있고 원판이 시계방향으로 움직이는 상황, 원판이 시계방향으로 움직일 경우 알파벳은 사실상 뒤로 가게 된다. 따라서 움직인 만큼
            // 인덱스를 차감해주어야 한다.
            // 자바는 음의 나머지를 리턴하므로 N만큼 더해주고 다시 N만큼 나머지 연산을 해주어야 한다
            int nextIndex = ((curIndex - step) % N + N) % N; //
            if (wheel[nextIndex] == '?') wheel[nextIndex] = nextAlphabet; // 만약 계산된 인덱스에 알파벳이 채워져있지 않는 경우 알파벳 바꾸기
            else if (wheel[nextIndex] != nextAlphabet) { // 만약 알파벳이 다른게 들어있다? 존재할 수 없는 바퀴
                System.out.println("!"); // ! 출력 후 종료
                return;
            }
            curIndex = nextIndex; // 현재 인덱스 수정
        }

        boolean[] used = new boolean[26]; // 하나의 원판에 똑같은 알파벳이 올 수 없다. 따라서 이를 처리해주어야 한다
        for (int i = 0; i < N; i++) {
            if (wheel[i] == '?') continue; // 그래서 '?'가 들어있을 경우 index를 초과할 수 있으므로 처리해주어야 한다.
            if (used[wheel[i] - 'A']) { // wheel[i]는 대문자가 들어있고, 'A'를 빼주면 해당 인덱스에 true로 기록해질것임.
                System.out.println("!"); // 만약 used[wheel[i] - 'A']가 true라면 '!' 출력
                return;
            }
            used[wheel[i] - 'A'] = true; // 그게 아니라면 해당 인덱스에 true로.
        }

        for (int i = 0; i < N; i++) { // 출력
            System.out.print(wheel[(curIndex + i) % N]);
        }

        bw.flush();
    }
}
