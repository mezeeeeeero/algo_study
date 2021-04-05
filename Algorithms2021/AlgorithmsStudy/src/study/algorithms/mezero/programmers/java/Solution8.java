package study.algorithms.mezero.programmers.java;
import java.util.ArrayList;

public class Solution8 {
    public int solution(int[][] board, int[] moves) {
        int answer = 0;
        ArrayList<Integer> basket = new ArrayList<>();
        int[][] temp = new int[board.length][board.length];

        temp = exchange(board, temp);

        for(int i = 0; i < moves.length; i++){
            int index = moves[i] -1;

            for(int j = 0; j < temp.length; j++){
                if(temp[index][j]!=0){
                    // PUSH
                    basket.add(temp[index][j]);
                    temp[index][j] = 0;

                    //POP
                    if(basket.size()>1){
                        if(basket.get(basket.size()-1) == basket.get(basket.size()-2)){
                            answer = answer+2;
                            basket.remove(basket.size()-1);
                            basket.remove(basket.size()-1);
                        }
                    }

                    break;
                }
            }
        }
        return answer;
    }

    public static int[][] exchange(int[][] board, int[][] temp){
        for(int i =0; i < board.length; i++){
            for(int j= 0; j < board.length; j++){
                temp[i][j] = board[j][i];
            }
        }

        return temp;
    }
}
