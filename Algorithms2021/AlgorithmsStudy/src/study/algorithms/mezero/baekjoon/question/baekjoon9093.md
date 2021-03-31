## 백준 > 9093번 단어뒤집기

### 문제
문장이 주어졌을 때, 단어를 모두 뒤집어서 출력하는 프로그램을 작성하시오.
단, 단어의 순서는 바꿀 수 없다. 단어는 영어 알파벳으로만 이루어져 있다.

### 입력
첫째 줄에 테스트 케이스의 개수 T가 주어진다. 각 테스트 케이스는 한 줄로 이루어져 있으며, 문장이 하나 주어진다.
단어의 길이는 최대 20, 문장의 길이는 최대 1000이다. 단어와 단어 사이에는 공백이 하나 있다.

### 출력
각 테스트 케이스에 대해서, 입력으로 주어진 문장의 단어를 모두 뒤집어 출력한다.

| 예제입력 1 | 예제출력 1|
|---|---|
|2 <br/> I am happy today <br/> We want to win the first prize|I ma yppah yadot <br /> eW tnaw ot niw eht tsrif ezirp|

<br/>


> 문제 : [백준](https://www.acmicpc.net/problem/9093) <br/>
> 문제출처 : [원출처-Asia Regional Taejon 2001](https://www.acmicpc.net/category/detail/884)


--- 

## 문제풀이 

### 설명
Stack을 사용하여 push, pop을 사용하는 방법을 택했다. <br/>
하지만 아직 더 다듬어야 하는 부분은 중복된 코드 부분이다.<br />
중복된 for문, 중복된 while문...<br />


### 코드
```java
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

```