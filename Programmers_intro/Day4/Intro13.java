package Programmers_intro.Day4;
//피자 나눠 먹기(1)
public class Intro13 {
    public int solution(int n) {
        int answer = 0;

        if((n%7)==0){
            answer = n/7;
        }else if((n%7)!=0){
            answer = n/7+1;
        }


        return answer;
    }
}
