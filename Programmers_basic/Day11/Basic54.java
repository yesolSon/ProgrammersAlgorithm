package Programmers_basic.Day11;
//카운트 다운

import java.util.ArrayList;
import java.util.List;

public class Basic54 {
    public int[] solution(int start, int end_num) {
        List<Integer> arr = new ArrayList<>();

        for(int i=0; i<=start-end_num; i++){
            arr.add(start-i);
        }

        int[] answer = new int[start-end_num+1];
        for(int i=0;i<arr.size();i++){
            answer[i]=arr.get(i);
        }
        return answer;
    }
}
