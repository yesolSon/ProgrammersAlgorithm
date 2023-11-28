package Programmers_intro.Day20;
//최댓값 만들기(2)

import java.util.Arrays;

public class Intro79 {
    public int solution(int[] numbers) {
        int answer = 0;
        Arrays.sort(numbers);

        int res1 = numbers[0]*numbers[1];
        int res2 = numbers[numbers.length-1]*numbers[numbers.length-2];

        if(res2>res1){
            answer = res2;
        }else{
            answer = res1;
        }

        return answer;
    }
}
