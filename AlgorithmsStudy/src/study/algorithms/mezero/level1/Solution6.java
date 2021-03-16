package study.algorithms.mezero.level1;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Solution6 {

    /**
     * 1. 일단 가져갈 수 있는 갯수 구하기
     * 2. 가져갈 수 있는 수와 포켓몬의 다양성을 확인,
     * 3. 다양성과 갯수중 작은 값 반환
     *
     */
    public int solution1(int[] nums) {
        int count = nums.length / 2;
        int answer = 0;

        Set<Integer> hashSet = new HashSet<>();
        for(int num : nums){
            hashSet.add(num);
        }

        if(hashSet.size() >= count ){
            answer = count;
        }else{
            answer = hashSet.size();
        }

        return answer;
    }
}
