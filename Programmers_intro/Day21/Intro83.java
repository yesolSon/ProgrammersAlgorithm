package Programmers_intro.Day21;
//삼각형의 완성조건

public class Intro83 {
    public int solution(int[] sides) {
        int answer = 0;

        int max = Math.max(sides[0],sides[1]);
        int min = Math.min(sides[0],sides[1]);

        int highRange = max+min;
        int lowRange = max-min;

        answer = highRange-lowRange-1;



        return answer;
    }
}
