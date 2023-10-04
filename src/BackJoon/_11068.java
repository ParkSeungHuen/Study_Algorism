package BackJoon;

import java.io.*;
import java.util.ArrayList;

public class _11068 {
    public static void _11068(String[] args) throws IOException { // 30분
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // 버퍼리드 선언
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine()); // 몇개 입력받을 건지 입력

        ArrayList<Integer> arr = new ArrayList<>();
        boolean success = false;

        for (int i = 0; i < N; i++) { // 입력받은 수 만큼 정수 입력받기
            arr.add(Integer.parseInt(br.readLine()));
        }

        ArrayList<Integer> arrayList = new ArrayList<>();

        for (int i = 0; i < arr.size(); i++) { // 입력받은 수 만큼 반복

            for (int j = 2; j <= 64; j++) { // 2 ~ 64진법 까지 반복, 2 ~ 64진법 까지 반복했을 때 아무것도 충족하지 못할 경우
                int num2 = arr.get(i);

                while (num2 > 0) {
                    arrayList.add(num2 % j); //n진법 변환 후 배열 추가
                    num2 = num2 / j;
                }

                for (int k = 0; k < arrayList.size() / 2; k++) { // 대칭되는 값이 같은 지 다른 지 판단하기
                    if(arrayList.get(k) != arrayList.get(arrayList.size() - 1 - k)) { // 다르면 회문이 아니므로 break
                        break;
                    }

                    if (k == (arrayList.size() / 2 - 1)) { // 만약 끝가지 갈 경우 성공
                        success = true;
                    }
                }

                arrayList.clear(); // 배열 clear
            }

            if (success == true) { // 판정
                System.out.println("1");
            } else {
                System.out.println("0");
            }

            success = false;
            arrayList.clear();
        }

        bw.flush();

    }
}
