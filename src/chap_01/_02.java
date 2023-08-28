package chap_01;

import java.util.Scanner;

public class _02 {
    public String Solution(String str) {
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            if (str.substring(i,i+1).equals(str.substring(i,i+1).toUpperCase())) {
                result = result.concat(str.substring(i,i+1).toLowerCase());
            }
            else{
                result = result.concat(str.substring(i,i+1).toUpperCase());
            }
        }
        return result;
    }

    public static void main(String[] args) {
        _02 T = new _02();
        Scanner s = new Scanner(System.in);
        String str = s.next();
        System.out.println(T.Solution(str));
    }
}
