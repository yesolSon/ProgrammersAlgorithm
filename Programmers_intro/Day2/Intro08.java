package Programmers_intro.Day2;
//배열 두 배 만들기

import java.util.ArrayList;
import java.util.List;

public class Intro08 {
    public int[] solution(int[] numbers) {

        List<Integer> arr= new ArrayList<>();

        for(int i=0; i<numbers.length; i++){
            arr.add(numbers[i]*2);
        }
        int[] answer = new int[arr.size()];
        for(int i=0; i<arr.size(); i++){
            answer[i]=arr.get(i);
        }
        return answer;
    }
}
