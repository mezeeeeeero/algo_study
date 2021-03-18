package study.algorithms.mezero.level1;

import java.util.Arrays;

public class Solution4 {

    /**
     * 배열 d를 오름차순으로 정렬하여 budget에서 그 값들을 빼다가 budget이 0이 되면 그 전 까지의 지원부서 수를 return
     */
    public int solution1(int[] d, int budget) {
        int answer = 0;
        Arrays.sort(d);

        for(int i = 0; i < d.length; i++){
            budget = budget - d[i];
            if(budget < 0){
                break;
            }
            answer++;
        }

        return answer;
    }
}
