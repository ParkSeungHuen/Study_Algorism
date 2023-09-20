import java.io.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // 버퍼리드 선언
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int[] array = new int[10001];

        for (int i = 0; i < N; i++) {
            array[Integer.parseInt(br.readLine())]++;
        }

        for (int i = 1; i <= N; i++) {
            if (array[i] > 0) {
                for (int j = 0; j < array[i]; j++) {
                    bw.write(i + "\n");
                }
            }
        }

        bw.flush();

    }
}
