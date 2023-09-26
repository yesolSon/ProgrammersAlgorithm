package Programmers_basic.Day7;

import java.util.ArrayList;
import java.util.List;

//카운트 업
public class Basic33 {
    public int[] solution(int start_num, int end_num) {
        List<Integer> arr = new ArrayList<>();
        for(int i=start_num; i<=end_num; i++){
            arr.add(i);
        }

        int[] answer = new int[arr.size()];
        for (int i = 0 ; i < arr.size() ; i++)
            answer[i] = arr.get(i).intValue();
        return answer;
    }
}
