package BackJoon;

import java.io.*;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class _10814 {

    public static class Member { // 이후 추가로 들어온 순서대로 정렬하고 싶으면 index를 하나 추가하여 응용할 수 있다 !!
        int age;
        String name;

        Member (int age, String name) {
            this.age = age;
            this.name = name;
        }
    }

    public static void _10814(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // 버퍼리드 선언
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        Member[] members = new Member[N];

        for (int i = 0; i < N; i++) {
            StringTokenizer tokenizer = new StringTokenizer(br.readLine());
            members[i] = new Member(Integer.parseInt(tokenizer.nextToken()), tokenizer.nextToken());
        }

        Arrays.sort(members, new Comparator<Member>() {
            @Override
            public int compare(Member o1, Member o2) { // 어차피 입력은 가입한 순서로 주니까 그냥 나이순으로 정렬만 해
                return o1.age - o2.age;
            }
        });

        for (int i = 0; i < N; i++) {
            bw.write(members[i].age + " " +members[i].name + "\n");
        }

        bw.flush();
    }
}
