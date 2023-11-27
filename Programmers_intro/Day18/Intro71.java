package Programmers_intro.Day18;
//세균 증식

public class Intro71 {
    public int solution(int n, int t) {
        int answer = n;

        for(int i=1;i<=t;i++){
            answer*=2;
        }

        return answer;
    }
}
