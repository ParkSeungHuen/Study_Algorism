package BackJoon;

import java.io.*;
import java.util.Arrays;
import java.util.Comparator;

public class _1302 {

    static class BookSale {
        int count;
        String name;

        BookSale (String name, int count) {
            this.name = name;
            this.count = count;
        }
    }

    public static void main(String[] args) throws IOException { // 30분
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // 버퍼리드 선언
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        String[] names = new String[N];

        for (int i = 0; i < N; i++) {
            names[i] = br.readLine();
        }
        Arrays.sort(names);

        BookSale[] bookSales = new BookSale[N]; // 결과 담기
        Arrays.fill(bookSales, new BookSale("", 0));
        int count = 1;
        for (int i = 0; i < N - 1; i++) {
            if (!names[i].equals(names[i + 1])) {
                bookSales[i] = new BookSale(names[i], count);
                count = 1;
                if (i == N - 2) {
                    bookSales[i + 1] = new BookSale(names[i + 1], count);
                }
            } else {
                count++;
                if (i == N - 2) {
                    bookSales[i] = new BookSale(names[i], count);
                }
            }

        }

        Arrays.sort(bookSales, new Comparator<BookSale>() {
            @Override
            public int compare(BookSale o1, BookSale o2) {
                if (o1.count == o2.count) {
                    return o2.name.compareTo(o1.name);
                }
                return o1.count - o2.count;
            }
        });

        if (N == 1) {
            bw.write(names[0] + "\n");
        } else {
            bw.write(bookSales[N - 1].name);
        }

        bw.flush();
    }
}
