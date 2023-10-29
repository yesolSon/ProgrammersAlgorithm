package Programmers_intro.Day10;
//배열 회전시키기

import java.util.ArrayList;
import java.util.List;

public class Intro40 {
    public int[] solution(int[] numbers, String direction) {
        List<Integer> arr = new ArrayList<>();
        int temp=0;

        if(direction.equals("right")){
            arr.add(numbers[numbers.length-1]);
            for(int i=0; i<numbers.length-1;i++){
                arr.add(numbers[i]);
            }
        }else{
            temp = numbers[0];
            for(int i=0;i<numbers.length-1;i++){
                arr.add(numbers[i+1]);
            }
            arr.add(temp);
        }

        int[] answer = new int[arr.size()];
        for(int i=0;i<arr.size();i++){
            answer[i]=arr.get(i);
        }

        return answer;
    }
}
