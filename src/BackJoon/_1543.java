package BackJoon;

import java.io.IOException;
import java.util.Scanner;

public class _1543 {

    public static void _1543(String[] args) throws IOException {
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        String searchStr = s.nextLine();

        String compareStr = "";
        int result = 0;

        for (int i = 0; i < str.length(); i++) {

            if (i + searchStr.length() <= str.length()) {
                compareStr = str.substring(i, i+searchStr.length());

                if (compareStr.equals(searchStr)) {
                    result++;
                    i += searchStr.length() - 1; // for 문에 기본적으로 i++해서 -1을 한 값을 더하기 해주기
                }
            }

        }

        System.out.println(result);

        s.close();

    }
}
