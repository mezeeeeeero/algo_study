package study.algorithms.mezero.programmers.java;

import java.util.*;

public class Solution15 {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];

        for(int i = 0; i < commands.length; i++){
            List<Integer> temp = new ArrayList<Integer>();
            int start = commands[i][0]-1;
            int end = commands[i][1]-1;
            for(int j = start; j <= end; j++){
                temp.add(array[j]);
            }
            Collections.sort(temp);
            answer[i] = temp.get(commands[i][2]-1);
        }

        return answer;
    }
}
