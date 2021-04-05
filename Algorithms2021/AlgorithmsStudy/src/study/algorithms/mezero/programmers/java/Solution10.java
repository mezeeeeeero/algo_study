package study.algorithms.mezero.programmers.java;

import java.util.ArrayList;

public class Solution10 {
    public int[] solution(int[] answers){
        int[] answer = {};
        int[] user1 = {1,2,3,4,5};
        int[] user2 = {2,1,2,3,2,4,2,5};
        int[] user3 = {3,3,1,1,2,2,4,4,5,5};

        int[] count = {0,0,0};

        for(int i = 0; i < answers.length; i++){
            if(answers[i] == user1[i%user1.length]){
                count[0]++;
            }
            if(answers[i] == user2[i%user2.length]){
                count[1]++;
            }
            if(answers[i] == user3[i%user3.length]){
                count[2]++;
            }
        }

        int maxScore = Math.max(count[0], Math.max(count[1], count[2]));
        ArrayList<Integer> list = new ArrayList<>();

        for(int i = 0; i < count.length; i++){
            if(maxScore == count[i]){
                list.add(i+1);
            }
        }

        answer = new int[list.size()];
        for(int i = 0; i < list.size(); i++){
            answer[i] = list.get(i);
        }

        return answer;
    }
}
