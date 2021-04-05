package study.algorithms.mezero.programmers.java;

import java.util.ArrayList;

public class Solution7 {
    public String solution1(int[] numbers, String hand) {
        String answer = "";
        int r_temp = 12;
        int l_temp = 10;

        for(int i : numbers){
            i = (i == 0)? 11 : i;
            int remain = i % 3;
            if(remain == 0){
                r_temp = i;
                answer = answer + "R";
            }else if(remain == 1){
                l_temp = i;
                answer = answer + "L";
            }else {
                int r_distance = getDistance(r_temp, i);
                int l_distance = getDistance(l_temp, i);

                if (r_distance == l_distance) {
                    if ("right".equals(hand)) {
                        answer = answer + "R";
                        r_temp = i;
                    } else {
                        answer = answer + "L";
                        l_temp = i;
                    }

                } else if (r_distance > l_distance) {
                    answer = answer + "L";
                    l_temp = i;
                } else {
                    answer = answer + "R";
                    r_temp = i;
                }
            }
        }

        return answer;
    }

    public static int getDistance(int temp, int number){
        temp = (temp == 0) ? 10 : temp - 1;
        number = (number == 0) ? 10 : number - 1;

        int temp_x = temp / 3;
        int temp_y = temp % 3;

        int number_x = number / 3;
        int number_y = number % 3;
        return Math.abs(number_x - temp_x) + Math.abs(number_y - temp_y);
    }
}
