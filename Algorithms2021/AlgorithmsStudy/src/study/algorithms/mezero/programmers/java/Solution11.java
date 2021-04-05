package study.algorithms.mezero.programmers.java;

public class Solution11 {
    public String Solution(String s){
        System.out.println(s);
        StringBuffer answer = new StringBuffer();
        String temp;
        String[] arr = s.split(" ");
        int size = arr.length;


        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[i].length(); j++){
                if((j%2) == 0 ){
                    System.out.println(j);
                    temp = Character.toString(arr[i].charAt(j)).toUpperCase();
                }else{
                    temp = Character.toString(arr[i].charAt(j)).toLowerCase();
                }
                answer.append(temp);
            }
            if(i < size-1){
                answer.append(" ");
            }

        }
        System.out.println(answer.toString());
        return answer.toString();
    }

    public String Solution1(String s){
        int i = 0;
        StringBuffer answer = new StringBuffer();

        for(int j = 0; j < s.length(); j++){
            if(s.charAt(j) != ' '){
                if( (i%2) == 0){
                    answer.append(Character.toString(s.charAt(j)).toUpperCase());
                }else{
                    answer.append(Character.toString(s.charAt(j)).toLowerCase());
                }
                i++;
            }else{
                i = 0;
                answer.append(" ");
            }
        }
        return answer.toString();
    }
}
