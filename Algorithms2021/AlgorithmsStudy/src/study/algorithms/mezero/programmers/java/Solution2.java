package study.algorithms.mezero.programmers.java;

public class Solution2 {

    public int solution1(int[] a, int[] b) {
        int answer = 0;
        for(int i =0; i < a.length; i++){
            answer += a[i] * b[i];
        }
        return answer;
    }

}
