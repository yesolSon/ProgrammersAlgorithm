package Programmers_basic.Day4;
//조건 문자열**

/*
문자열에 따라 다음과 같이 두 수의 크기를 비교하려고 합니다.

- 두 수가`n`과`m`이라면
    - ">", "=" :`n`>=`m`
    - "<", "=" :`n`<=`m`
    - ">", "!" :`n`>`m`
    - "<", "!" :`n`<`m`

두 문자열`ineq`와`eq`가 주어집니다.`ineq`는 "<"와 ">"중 하나고,`eq`는 "="와 "!"중 하나입니다.
그리고 두 정수`n`과`m`이 주어질 때,`n`과`m`이`ineq`와`eq`의 조건에 맞으면 1을 아니면 0을 return하도록 solution 함수를 완성해주세요.
*/
public class Basic19 {
    public static int solution(String ineq, String eq, int n, int m) {
        int answer = 0;

        if(ineq.equals(">") && eq.equals("=")){
            if(n>=m){
                answer=1;
            }else{
                answer=0;
            }
        }else if(ineq.equals("<") && eq.equals("=")){
            if(n<=m){
                answer=1;
            }else{
                answer=0;
            }
        }else if(ineq.equals(">") && eq.equals("!")){
            if(n>m){
                answer=1;
            }else{
                answer=0;
            }
        }else if(ineq.equals("<") && eq.equals("!")){
            if(n<m){
                answer=1;
            }else{
                answer=0;
            }
        }
        return answer;
    }

    public static void main(String[] args){
        System.out.println(solution("<","=",20,50));
    }
}
