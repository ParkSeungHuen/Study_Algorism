package BackJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class _25192 {

    public class Main {

        //    public static void main(String[] args) {
//        Main T = new Main();
//        Scanner s = new Scanner(System.in);
//        int a = s.nextInt();
//
//        String[] list = new String[a];
//        int result = 0;
//
//        for (int i = 0; i < a; i++) {
//            String str = s.nextLine();
//            switch (str){
//                case "ENTER":
//                    Arrays.fill(list, "");
//                    break;
//
//                default:
//                    if (!Arrays.asList(list).contains(str)) {
//                        result++;
//                    }
//                    break;
//            }
//
//        }
//        System.out.println(result);
//
//    }

        // 그냥 Scanner를 이용할 경우 시간초과, 아래와 같이 HashMap 및 BufferReader를 사용해주어야 빨라진다
        public static void main(String[] args) throws IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            StringBuilder str = new StringBuilder();

            // N
            int N = Integer.parseInt(br.readLine());
            HashSet<String> set = new HashSet<>();
            int ans = 0;

            for (int n = 0; n < N; n++) {
                String s = br.readLine();
                if (s.equals("ENTER")) {
                    set.clear();
                    continue;
                }
                if (!set.contains(s)) {
                    set.add(s);
                    ans++;
                }
            }

            str.append(ans);

            System.out.print(str);
            br.close();
        }
    }

}
