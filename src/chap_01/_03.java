package chap_01;

import java.util.Scanner;

public class _03 {
    public String Solution(String str) {
        int n = 0;
        String result = "";
        String[] s = str.split(" ");
        for (int i = 0; i < s.length; i++) {
            if (result.length() < s[i].length()) {
                result = s[i];
            }
        }
        return result;
    }

    public static void main(String[] args) {
        _03 T = new _03();
        Scanner s = new Scanner(System.in);
        String str = s.nextLine(); // Scanner 객체는 띄어쓰기를 할 경우 각각 입력되므로 한 줄을 입력받을 때에는 nextLine()을 사용해준다.
        System.out.println(T.Solution(str));
    }
}
