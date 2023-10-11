package Programmers_basic.Day13;
//순서바꾸기

import java.util.ArrayList;
import java.util.List;

public class Basic62 {

    public int[] solution(int[] num_list, int n) {
        List<Integer> arr = new ArrayList<>();

        //n번째 이후의 원소들
        for (int i = n; i < num_list.length; i++) {
            arr.add(num_list[i]);
        }

        //n번째까지의 원소들
        for (int i = 0; i < n; i++) {
            arr.add(num_list[i]);
        }

        int[] answer = new int[arr.size()];
        for (int i = 0; i < arr.size(); i++) {
            answer[i] = arr.get(i);
        }


        return answer;
    }

}
