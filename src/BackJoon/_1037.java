package BackJoon;

import java.util.Arrays;
import java.util.Scanner;

public class _1037 {
    public void Solution(int[] n) {

        Arrays.sort(n);
        System.out.println(n[0] * n[n.length-1]);
    }


    public static void main(String[] args) {
        _1037 T = new _1037();
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int[] n = new int[a];

        for (int i = 0; i < a; i++) {
            n[i] = s.nextInt();
        }

        T.Solution(n);

    }
}
