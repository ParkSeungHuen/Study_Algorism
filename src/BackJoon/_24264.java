package BackJoon;

import java.io.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class _24264 {
    public static void _24264(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        long N = Long.parseLong(br.readLine()); // 입력 크기가 500000까지라서 자료형의 크기를 늘려주어야 함

        bw.write(N * N + "\n");
        bw.write("2" + "\n");
        bw.flush();

    }
}

