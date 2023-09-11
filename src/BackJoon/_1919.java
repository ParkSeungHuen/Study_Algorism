package BackJoon;

import java.io.IOException;
import java.util.Scanner;

public class _1919 {

    public static void _1919(String[] args) throws IOException {
        Scanner s = new Scanner(System.in);
        String word1 = s.next();
        String word2 = s.next();

        int[] countA = new int[26]; // a ~ z 까지
        int[] countB = new int[26]; // a ~ z 까지

        for (int i = 0; i < word1.length(); i++) {
            countA[word1.charAt(i) - 'a']++; // 배열을 이용하여 각 구성성분의 개수를 표현할 수 있다
        }

        for (int i = 0; i < word2.length(); i++) {
            countB[word2.charAt(i) - 'a']++;
        }

        int ans = 0;
        for (int i = 0; i < countA.length; i++) {
            ans += Math.abs(countA[i] - countB[i]);
        }

        System.out.println(ans);

        s.close();

    }


}
