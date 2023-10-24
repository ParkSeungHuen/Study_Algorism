package BackJoon;

import java.io.*;
import java.util.StringTokenizer;

public class _25206 {

    public static void _25206(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = 20;

        double sum = 0.0;
        double subjectCount = 0.0;

        for (int i = 0; i < N; i++) {
            StringTokenizer tokenizer = new StringTokenizer(br.readLine());
            String subject = tokenizer.nextToken(); // 과목명 (쓰이진 않음)
            double grade = Double.parseDouble(tokenizer.nextToken()); // 1.0, 2.0, 3.0, 4.0
            String score = tokenizer.nextToken(); // A+

            switch (score) {
                case "A+":
                    sum += grade * 4.5;
                    subjectCount += grade;
                    break;

                case "A0":
                    sum += grade * 4.0;
                    subjectCount += grade;
                    break;

                case "B+":
                    sum += grade * 3.5;
                    subjectCount += grade;
                    break;

                case "B0":
                    sum += grade * 3.0;
                    subjectCount += grade;
                    break;

                case "C+":
                    sum += grade * 2.5;
                    subjectCount += grade;
                    break;

                case "C0":
                    sum += grade * 2.0;
                    subjectCount += grade;
                    break;

                case "D+":
                    sum += grade * 1.5;
                    subjectCount += grade;
                    break;

                case "D0":
                    sum += grade;
                    subjectCount += grade;
                    break;

                case "F":
                    subjectCount += grade;
                case "P":
                    break;
            }
        }

        bw.write(sum / subjectCount + "\n");
        bw.flush();

    }
}
