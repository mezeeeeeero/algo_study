package study.algorithms.mezero.programmers.java;

import java.util.ArrayList;

public class Solution14 {
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = 0;
        answer = n - lost.length;

        ArrayList<Integer> reserveList = new ArrayList<>();
        for(int temp : reserve){
            reserveList.add(temp);
        }

        ArrayList<Integer> lostList = new ArrayList<>();
        for(int temp : lost){
            lostList.add(temp);
        }

        for(int i : lost){
            if(reserveList.contains(i))  {
                reserveList.remove(reserveList.indexOf(i));
                lostList.remove(lostList.indexOf(i));
                answer++;
            }
        }

        for(int i = 0; i < lostList.size(); i++) {
            if (reserveList.contains(lostList.get(i) + 1)) {
                reserveList.remove(reserveList.indexOf(lostList.get(i) + 1));
                answer++;
            } else if (reserveList.contains(lostList.get(i) - 1)) {
                reserveList.remove(reserveList.indexOf(lostList.get(i) - 1));
                answer++;
            }
        }
        return answer;
    }
}
