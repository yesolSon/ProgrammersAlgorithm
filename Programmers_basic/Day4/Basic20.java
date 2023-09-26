package Programmers_basic.Day4;
//flag에 따라 다른 값 반환하기

/*
두 정수a,b와 boolean 변수flag가 매개변수로 주어질 때,
flag가 true면 a+b를 false면 a-b를 return 하는 solution 함수를 작성해 주세요.
*/
public class Basic20 {
    public static int solution(int a, int b, boolean flag){
        int answer = 0;

        if(flag){
            answer = a+b;
        }else{
            answer = a-b;
        }
        return answer;
    }
    public static void main(String[] args){
        System.out.println(solution(-4,7,false));
    }
}
