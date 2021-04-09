package study.algorithms.mezero.programmers.java;

public class Solution13_kakao_newId {
    public String solution(String new_id){
        String answer = "";

        answer = new_id.toLowerCase();
        answer = answer.replaceAll("[^a-z0-9-_.]", "");
        answer = answer.replaceAll("[.]{2,}", ".");
        answer = answer.replaceAll("^[.]|[.]$", "");

        if(answer.isEmpty()){
            answer = "a";
        }

        if(answer.length() >= 16){
            answer = answer.substring(0, 15);
            answer = answer.replaceAll("[.]$", "");
        }

        if (answer.length() <= 2) {
            while (answer.length() < 3) {
                answer = answer + answer.charAt(answer.length()-1);
            }
        }
        return answer;
    }


    public String solution1(String new_id){
        int MAX_LENGTH = 15;
        int MIN_LENGTH = 3;
        String answer = "";

        answer = new_id.toLowerCase();
        answer = answer.replaceAll("[^a-z0-9-_.]", "");
        answer = answer.replaceAll("[.]{2,}", ".");
        answer = answer.replaceAll("^[.]|[.]$", "");

        if(answer.isEmpty()){
            answer = "a";
        }else if(answer.length() > MAX_LENGTH){
            answer = answer.substring(0, MAX_LENGTH);
            answer = answer.replaceAll("[.]$", "");
        }

        if (answer.length() < MIN_LENGTH) {
            while (answer.length() < 3) {
                answer = answer + answer.charAt(answer.length()-1);
            }
        }
        return answer;
    }

}

