package study.algorithms.mezero.level1;

import java.util.*;

public class Solution1 {

    /**
     * Array List 를 이용한 풀이
     * @param numbers
     * @return
     */
    public int[] solution1(int[] numbers){
        ArrayList<Integer> list = new ArrayList<>();
        int j, sum = 0;

        for(int i = 0; i < numbers.length; i++){
            for(j = i+1; j < numbers.length; j++){
                if(i != j) {
                    sum = numbers[i] + numbers[j];
                    if (!list.contains(sum)) { // 중복제거를 위함
                        list.add(sum);
                    }
                }
            }
        }

        int[] answer = new int[list.size()];
        for(int i = 0; i < list.size(); i++){
            answer[i] = list.get(i);
        }

        Arrays.sort(answer); // 배열 정렬

        return answer;
    }


    /**
     * Set 이용한 풀이
     * 'Set'은 중복제거의 기능을 이미 탑재. 신경 안써도 되는 상황
     * 그 중 TreeSet의 경우 정렬까지 알아서 해주므로 TreeSet을 사용하여 해결
     */
    public int[] solution2(int[] numbers) {
        Set<Integer> treeSet = new TreeSet<Integer>();
        int j;
        for(int i  = 0; i < numbers.length; i++){
            for(j = i + 1 ; j < numbers.length; j++){
                treeSet.add(numbers[i] + numbers[j]);
            }
        }

        /**     --- 이것도 충분히 돌아감 ---
         *
         *         int[] answer = new int[trssSet.size()];
         *         int index = 0;
         *         Iterator iterator = trssSet.iterator();
         *         while(iterator.hasNext()){
         *             answer[index] = (int)iterator.next();
         *             index++;
         *         }
         *
         *         return answer;
         *
         *      -----------------------
         *
         *      하지만 Set에 있는 toArray 를 사용해보기 위해 늘어뜨려봄
         */

        int[] answer = Arrays.stream(treeSet.toArray(new Integer[treeSet.size()])).mapToInt(Integer::intValue).toArray();

        return answer;
    }
}
