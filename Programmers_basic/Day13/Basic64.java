package Programmers_basic.Day13;
//n번째 원소까지

import java.util.ArrayList;
import java.util.List;

public class Basic64 {
    public int[] solution(int[] num_list, int n) {
        List<Integer> arr = new ArrayList<>();

        for(int i=0; i<n;i++){
            arr.add(num_list[i]);
        }

        int[] answer = new int[arr.size()];
        for(int i=0; i<arr.size(); i++){
            answer[i]=arr.get(i);
        }
        return answer;
    }
}
