package Programmers_basic;
//주사위 게임2

public class Basic23 {
    public static int solution(int a, int b, int c) {
        int answer = 0;
        if(a==b && b==c){
            answer=(a+b+c)*(a*a+b*b+c*c)*(a*a*a+b*b*b+c*c*c);
        }else if(a==b | a==c | b==c){
            answer=(a+b+c)*(a*a+b*b+c*c);
        }else{
            answer=a+b+c;
        }

        return answer;
    }

    public static void main(String[] args){
        System.out.println(solution(2,6,1));
    }
}
