package chap_01;

import java.util.Scanner;

public class _01 {
    public int Solution(String str, String a) {
        int result = 0;
        String text = str.toUpperCase();
        for (int i = 1; i <= text.length(); i++) {
            if(text.substring(i-1,i).equals(a.toUpperCase())) {
                result++;
            }
        }
        return result;
    }


    public static void main(String[] args) {
        _01 T = new _01();
        Scanner s = new Scanner(System.in);
        String str = s.next(); // 문자열은 그냥 next하면 되는것같음
        String b = s.next();
        System.out.println(T.Solution(str, b));
    }
}
