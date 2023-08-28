package chap_01;

import java.util.Scanner;

public class _04 {
    public void Solution(int num, String[] str) {
        for (int i = 0; i < num; i++) {
            String result = "";
            for (int j = 0; j < str[i].length(); j++) {
                result = result.concat(str[i].substring((str[i].length() - j - 1), (str[i].length() - j)));
            }
            System.out.println(result);
        }
    }

    public static void main(String[] args) {
        _04 T = new _04();
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        String[] result = new String[num];
        for (int i = 0; i < num; i++) {
            result[i] = s.next();
        }

        T.Solution(num, result);

    }
}
