package Programmers_intro.Day09;
//개미 군단

public class Intro33 {
    public int solution(int hp) {
        int answer = 0;
        int ga = 0;
        int sa = 0;
        int ant = 0;

        ga=hp/5;
        sa=(hp%5)/3;
        ant=(hp%5)%3;

        answer=ga+sa+ant;
        return answer;
    }
}
