package Programmers_basic.Day13;
//n개 간격의 원소들

import java.util.ArrayList;
import java.util.List;

public class Basic65 {
    public int[] solution(int[] num_list, int n) {
        List<Integer> arr = new ArrayList<>();

        for(int i=0; i<num_list.length; i+=n){
            arr.add(num_list[i]);

        }

        int[] answer = new int[arr.size()];
        for(int i=0; i<arr.size(); i++){
            answer[i]=arr.get(i);
        }
        return answer;
    }
}
