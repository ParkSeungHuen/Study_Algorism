package BackJoon;

import java.io.IOException;
import java.util.Scanner;

public class _2744 {

    public static void _1919(String[] args) throws IOException {
        _2744 T = new _2744();
        Scanner s = new Scanner(System.in);
        String content = s.next();

        for (int i = 0; i < content.length(); i++) {
            if('A' <= content.charAt(i) && 'Z' >= content.charAt(i)) {
                System.out.print((char)('a' + content.charAt(i) - 'A'));
            } else {
                System.out.print((char)(content.charAt(i) + 'A' - 'a'));
            }
        }
        s.close();

    }
}
