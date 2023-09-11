package BackJoon;

import java.io.IOException;
import java.util.Scanner;

public class _1157 {

    public static int[] countConverter(String str) {
        int[] count = new int[26];

        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i) >= 'A' && str.charAt(i) <= 'Z') { // 대문자 A ~ Z 아스키 코드 : 65~90 소문자 a ~ z 아스키코드 : 97~122
                count[(str.charAt(i) - 'A')]++;
            } else {
                count[(str.charAt(i) - 'a')]++;
            }
        }

        return count;
    }

    public static void _1157(String[] args) throws IOException {
        Scanner s = new Scanner(System.in);
        String word = s.next();
//        String word = s.next().toUpperCase(); // 입력을 대문자로 바꾸어서 할 수 있음

        int[] count = countConverter(word);

        int maxCount = -1; // 초깃값 -1
        char alphabetResult = '?'; // 초깃값 '?'

        for (int i = 0; i < count.length; i++) { // 이후 콜렉션 기능 배울 때 min, max등을 사용할 수 있다
            if(count[i] > maxCount) {
                maxCount = count[i];
                alphabetResult = (char)('A' + i);
            }
            else if(count[i] == maxCount) { // 같은 count일 경우 ?로 변환, 이후 다른거로 비교할 때 바뀜
                alphabetResult = '?';
            }
        }

        System.out.println(alphabetResult);

        s.close();

    }
}
