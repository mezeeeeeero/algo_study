package study.algorithms.mezero.programmers.java;

public class Solution9 {
    public String solution1(String s, int n) {
        StringBuilder answer = new StringBuilder();

        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);

            if(Character.isLowerCase(c)){
                c = (c+n) > 'z'? (char)((c+n) - 26) : (char) (c+n);
            }else if(Character.isUpperCase(c)){
                c = (c+n) > 'Z'? (char)((c+n) - 26) : (char) (c+n);
            }
            answer = answer.append(c);
        }
        return answer.toString();
    }
}
