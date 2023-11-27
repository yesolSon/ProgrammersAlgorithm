package Programmers_intro.Day18;
//제곱수 판별하기

public class Intro70 {
    public int solution(int n) {
        int answer = 0;

        for(int i=1;i<n;i++){
            if(n%i==0){
                if(n/i==i){
                    answer=1;
                    break;
                }else{
                    answer=2;
                }
            }
        }

        return answer;
    }
}
