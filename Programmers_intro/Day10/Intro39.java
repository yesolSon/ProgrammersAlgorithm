package Programmers_intro.Day10;
//공 던지기

public class Intro39 {
    public int solution(int[] numbers, int k) {
        return numbers[2*(k-1)%numbers.length];
    }
}
