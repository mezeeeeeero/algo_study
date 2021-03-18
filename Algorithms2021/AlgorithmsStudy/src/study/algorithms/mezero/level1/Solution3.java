package study.algorithms.mezero.level1;

public class Solution3 {

    /**
     * 3진수 변환 방식 : 나누기 3하여 몫이 0이 아니면 while문 들어가기
     * temp는 나머지값을 모아 3진수로 변환하기 위해
     * 몫이 나온 순서를 거꾸로 뒤집어야 제대로 3진수가 나오니까 그동안 쌓인 notation3를 뒤에 붙여준다.
     * n은 3으로 나눈 몫으로 바꾼다.
     *
     * 마지막에 notation3에 n이었던 마지막 값을 맨 앞에 추가해준다.
     */
    public int solution1(int n) {
        String notation3 = "";
        int temp = 0;

        // 3진수 변환
        while( n / 3 != 0){
            temp = n % 3 ;
            notation3 = temp + notation3;
            n = n / 3;
        }

        notation3 = n + notation3;

        //글자뒤집기
        String tempString = new StringBuffer(notation3).reverse().toString();

        // 3진수 String을  10진수로 변환
        int answer = Integer.valueOf(tempString, 3);
        return answer;
    }

    /**
     * 기본제공되는 메소드 사용
     */
    public int solution2(int n) {
        String notation3 = Integer.toString(n, 3);
        String temp = new StringBuffer(notation3).reverse().toString();
        int answer = Integer.valueOf(temp, 3);

        return answer;
    }

}
