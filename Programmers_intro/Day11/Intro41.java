package Programmers_intro.Day11;
//주사위 개수
public class Intro41 {
    public int solution(int[] box, int n) {
        int answer = 0;

        answer = (box[0]/n)*(box[1]/n)*(box[2]/n);

        return answer;
    }
}
