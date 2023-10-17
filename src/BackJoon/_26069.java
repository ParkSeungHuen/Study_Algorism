package BackJoon;

import java.io.*;
import java.util.HashSet;
import java.util.StringTokenizer;

public class _26069 {

    public static void _26069(String[] args) throws IOException { // 30분
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // 버퍼리드 선언
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        HashSet<String> set = new HashSet<>();

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String name1 = st.nextToken();
            String name2 = st.nextToken();


            if (set.contains(name1) || set.contains(name2) || name1.equals("ChongChong") || name2.equals("ChongChong")) {
                set.add(name1);
                set.add(name2);
            }
        }

        System.out.println(set.size());

    }

}
