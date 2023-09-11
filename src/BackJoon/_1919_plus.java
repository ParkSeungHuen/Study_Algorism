package BackJoon;

import java.io.IOException;
import java.util.Scanner;

public class _1919_plus {

    // count 배열 함수화 및 Math 함수를 이용한 절댓값 계산

    public static int[] countConverter(String str) {
        int[] count = new int[26];

        for (int i = 0; i < str.length(); i++) {
            count[str.charAt(i) - 'a']++; // 배열을 이용하여 각 구성성분의 개수를 표현할 수 있다
        }

        return count;
    }

    public static void _1919_plus(String[] args) throws IOException {
        Scanner s = new Scanner(System.in);
        String word1 = s.next();
        String word2 = s.next();

        int[] countA = countConverter(word1);; // a ~ z 까지
        int[] countB = countConverter(word2);; // a ~ z 까지

        int ans = 0;
        for (int i = 0; i < countA.length; i++) {
            ans += Math.abs(countA[i] - countB[i]);
        }

        System.out.println(ans);

        s.close();

    }
}
