package study.algorithms.mezero.programmers.java;

public class Solution16 {
    public String solution(int num) {
        String answer = "";
        if(num%2 == 0){
            answer = "Even";
        }else{
            answer = "Odd";
        }
        return answer;
    }


    public class Solution{
        public String solution(int num) {
            String answer = num % 2 == 0? "Even" : "Odd";
            return answer;
        }
    }

}


