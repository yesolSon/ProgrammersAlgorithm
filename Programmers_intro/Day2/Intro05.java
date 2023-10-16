package Programmers_intro.Day2;
//두 수의 나눗셈

public class Intro05 {
    public int solution(int num1, int num2) {
        double answer = 0;

        answer = ((double)num1/(double)num2)*1000;

        return (int)answer;
    }
}
