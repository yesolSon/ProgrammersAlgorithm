package Programmers_intro.Day12;
//소인수분해

import java.util.ArrayList;
import java.util.List;

public class Intro48 {
    public int[] solution(int n) {
        int[] answer={};
        List<Integer> arr = new ArrayList<>();

        int i=2;
        while(n>1){
            if(n%i==0){
                arr.add(i);
                n/=i;
            }else{
                i++;
            }
        }
        answer = arr.stream().distinct().mapToInt(Integer::intValue).toArray();

        return answer;
    }
}
