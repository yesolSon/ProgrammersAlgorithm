package Programmers_basic;
//n의 배수

/*
정수num과 n이 매개 변수로 주어질 때,num이 n의 배수이면 1을 return
n의 배수가 아니라면 0을 return하도록 solution 함수를 완성해주세요.

num	  n	 result
98	  2	   1
34	  3	   0
*/
public class Basic16 {
    public static int solution(int num, int n){
        int answer = 0;

        if((num%n)==0){
            answer=1;
        }else{
            answer=0;
        }
        return answer;
    }

    public static void main(String[] args){
        System.out.println(solution(98,2));
    }
}
