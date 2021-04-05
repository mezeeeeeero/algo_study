package study.algorithms.mezero.programmers.java;

import java.util.Arrays;

public class Solution5 {
    public int solution1(int[] nums) {
        int sum = 0;
        int answer = 0;
        for(int i = 0; i < nums.length; i++){
            for(int j = i+1; j < nums.length; j++){
                for(int k = j+1; k < nums.length; k++){
                    sum = nums[i] + nums[j] + nums[k];
                    if(isPrime(sum)){
                        answer++;
                    }
                }
            }
        }
        return answer;
    }

    public static boolean isPrime(int sum){
        boolean isPrime = true;
        for(int i = 2; i < sum; i++){
            if(sum % i == 0){
                isPrime = false;
            }
        }
        return isPrime;
    }

}
