package BackJoon;

import java.io.IOException;
import java.util.Scanner;

public class _13223 {
    public static void _13223(String[] args) throws IOException {
        Scanner s = new Scanner(System.in);
        String startTime = s.nextLine();
        String mixTime = s.nextLine();

        int[] resultTime = new int[3];
        String[] printTime = new String[3];

        String[] startTimeCount = startTime.split(":");
        String[] mixTimeCount = mixTime.split(":");

        if(Integer.parseInt(startTimeCount[0]) > Integer.parseInt(mixTimeCount[0])) {
            resultTime[0] = 24 + Integer.parseInt(mixTimeCount[0]) - Integer.parseInt(startTimeCount[0]);
        } else {
            resultTime[0] = Integer.parseInt(mixTimeCount[0]) - Integer.parseInt(startTimeCount[0]);
        }

        for (int i = 1; i < 3; i++) {
            if(Integer.parseInt(startTimeCount[i]) > Integer.parseInt(mixTimeCount[i])) {
                resultTime[i] = 60 + Integer.parseInt(mixTimeCount[i]) - Integer.parseInt(startTimeCount[i]);
                resultTime[i-1]--;
            } else {
                resultTime[i] = Integer.parseInt(mixTimeCount[i]) - Integer.parseInt(startTimeCount[i]);
            }
        }

        if(resultTime[2] < 0) {
            resultTime[2] = resultTime[2] + 60;
            resultTime[1]--;
        }

        if(resultTime[1] < 0) {
            resultTime[1] = resultTime[1] + 60;
            resultTime[0]--;
        }

        if(resultTime[0] < 0) {
            resultTime[0] = resultTime[0] + 24;
        }

        for (int i = 0; i < 3; i++) {
            if(resultTime[i] < 10) {
                printTime[i] = "0" + resultTime[i];
            } else {
                printTime[i] = String.valueOf(resultTime[i]);
            }
        }

        if(printTime[0].equals("00") && printTime[1].equals("00") && printTime[2].equals("00")) {
            System.out.println("24:00:00");
        } else {
            System.out.println(printTime[0] + ":" + printTime[1] + ":" + printTime[2]);
        }

        s.close();

    }
}
