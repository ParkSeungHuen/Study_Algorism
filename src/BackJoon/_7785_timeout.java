package BackJoon;

import java.io.*;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class _7785_timeout {

    public static class ConfirmPeople {
        String name;
        String exit;

        ConfirmPeople (String name, String exit){
            this.name = name;
            this.exit = exit;
        }
    }

    public static void _7785_timeout(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // 버퍼리드 선언
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        ConfirmPeople[] confirmPeople = new ConfirmPeople[N];
        Arrays.fill(confirmPeople, new ConfirmPeople("", "")); // N

        for (int i = 0; i < N; i++) {
            StringTokenizer tokenizer = new StringTokenizer(br.readLine());
            String name = tokenizer.nextToken();
            String exit = tokenizer.nextToken();

            if (exit.equals("leave")) {
                for (int j = 0; j < confirmPeople.length; j++) {
                    if (confirmPeople[j].name.equals(name)) {
                        confirmPeople[j] = new ConfirmPeople("", "");
                        break;
                    }
                }
            } else {
                confirmPeople[i] = new ConfirmPeople(name, exit);
            }
        }

        Arrays.sort(confirmPeople, new Comparator<ConfirmPeople>() {
            @Override
            public int compare(ConfirmPeople o1, ConfirmPeople o2) {
                return o2.name.compareTo(o1.name);
            }
        });

        for (int i = 0; i < confirmPeople.length; i++) {
            if (confirmPeople[i].name != "") {
                bw.write(confirmPeople[i].name + "\n");
            }
        }

        // 시간복잡도 : N^2, 시간 초과
        bw.flush();
    }
}
