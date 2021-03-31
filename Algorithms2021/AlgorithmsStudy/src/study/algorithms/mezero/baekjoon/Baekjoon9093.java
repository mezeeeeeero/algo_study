package study.algorithms.mezero.baekjoon;

import java.util.Scanner;
import java.util.Stack;

public class Baekjoon9093 {
    public void Solution1 (){

        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        sc.nextLine(); // 숫자 입력 후 엔터키 입력을 했을 경우 건너뛰는 것을 방지.

        String[] inputValue = new String[count];
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < count ; i++){
            inputValue[i] = sc.nextLine();
            Stack<Character> stack = new Stack<>();

            for(int j = 0; j < inputValue[i].length(); j++){

                if(inputValue[i].charAt(j) == ' '){
                    while(!stack.isEmpty()) {
                        sb.append(stack.peek());
                        stack.pop();
                    }
                    sb.append(" ");

                }else{
                    stack.push(inputValue[i].charAt(j));
                }
            }

            while(!stack.isEmpty()){
                sb.append(stack.peek());
                stack.pop();
            } //문장의 마지막에는 공백이 없다...

            sb.append("\n");
        }
        System.out.println(sb.toString());
    }
}
