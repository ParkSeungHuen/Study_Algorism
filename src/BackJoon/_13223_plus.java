package BackJoon;

import java.io.IOException;
import java.util.Scanner;

public class _13223_plus {
    public static void _13223_plus(String[] args) throws IOException {
        Scanner s = new Scanner(System.in);
        String startTime = s.nextLine();
        String endTime = s.nextLine();

        // 각 시간을 구하기 위해 subString을 이용한 슬라이싱, charAt을 이용한 나누기, split을 통한 나누기 총 세가지 방법을 사용할 수 있음.
        // subString은 고정된 구간에서 슬라이싱을 하기 때문에 split이 더 유연한 방법인 것 같음
        // charAt은 숫자 5 문자의 고유 숫자와 숫자 0 문자의 고유숫자를 빼서 10곱하는 느낌으로 함
        // 어떤 문제에 따라 분리하는 방법을 다르게 하는 것을 추천
        String[] startTimeCount = startTime.split(":");
        String[] endTimeCount = endTime.split(":");

        // 일괄적으로 처리하기 위해 최소단위인 초로 변환
        int startTimeSecond = Integer.parseInt(startTimeCount[0]) * 3600 + Integer.parseInt(startTimeCount[1]) * 60 + Integer.parseInt(startTimeCount[2]);
        int endTimeSecond = Integer.parseInt(endTimeCount[0]) * 3600 + Integer.parseInt(endTimeCount[1]) * 60 + Integer.parseInt(endTimeCount[2]);
        int resultTime = endTimeSecond - startTimeSecond;

        // 만약 음수가 나올 경우 24시간 더하기
        if (resultTime < 0) {
            resultTime = resultTime + 24 * 3600;
        }

        // 시간을 구하기
        int resultHour = resultTime / 3600;
        int resultMinute = (resultTime % 3600) / 60;
        int resultSecond = resultTime % 60;

        // 같은 시간일 경우 24:00으로 출력
        if(resultHour == 0 && resultMinute == 0 && resultSecond == 0) {
            System.out.println("24:00:00");
        } else {
            System.out.printf("%02d:%02d:%02d", resultHour, resultMinute, resultSecond);
        }

        s.close();

    }
}
