package study.algorithms.mezero.programmers.java;

import java.util.Calendar;

public class Solution18 {
    public String solution(int a, int b) {
        String answer = "";
        String[] week = {"SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT"};
        Calendar cal = Calendar.getInstance();
        a = a -1;
        cal.set(2016, a<10? Integer.parseInt( "0"+a) : a, b<10? Integer.parseInt( "0"+b) : b);
        int i = cal.get(Calendar.DAY_OF_WEEK) -1;
        answer = week[i];
        return answer;
    }
}
