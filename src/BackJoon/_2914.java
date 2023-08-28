package BackJoon;

import java.util.Scanner;

public class _2914 {
    public void Solution(int album, int average) {

        int result = album * average - (album - 1);
        System.out.println(result);

    }

    public static void main(String[] args) {
        _2914 T = new _2914();
        Scanner s = new Scanner(System.in);
        int album = s.nextInt();
        int average = s.nextInt();
        T.Solution(album, average);
    }
}
