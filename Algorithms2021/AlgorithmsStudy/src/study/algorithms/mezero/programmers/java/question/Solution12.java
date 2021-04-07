package study.algorithms.mezero.programmers.java.question;

import java.util.*;

public class Solution12 {
    public String solution(String[] participant, String[] completion) {
        String answer = "";

        ArrayList<String> arrayList = new ArrayList<>();
        for(String name : participant){
            arrayList.add(name);
        }

        for(String name : completion){
            for(String list : arrayList){
                if(name.equals(list)) {
                    arrayList.remove(name);
                    break;
                }
            }
        }

        answer = arrayList.get(0);
        return answer;
    }

    public String solution2(String[] participant, String[] completion) {
        String answer = "";

        Map<String, Integer> map = new HashMap<>();
        for(String name : participant){
            if(map.containsKey(name)){
                map.put(name, map.get(name)+1);
            }else{
                map.put(name, 1);
            }
        }

        for(String name : completion){
            map.put(name, map.get(name)-1);
        }

        for(String name : map.keySet()){
            if(map.get(name) != 0){
                answer = name;
            }
        }

        return answer;
    }
}
