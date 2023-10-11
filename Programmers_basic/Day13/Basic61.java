package Programmers_basic.Day13;
//n번째 원소부터

import java.util.*;

public class Basic61 {
    public int[] solution(int[] num_list, int n) {

        List<Integer> arr = new ArrayList<>();

        for (int i = 0; i < num_list.length; i++) {
            if (i >= (n - 1)) {
                arr.add(num_list[i]);
            }
        }
        int[] answer = new int[arr.size()];
        for (int i = 0; i < arr.size(); i++) {
            answer[i] = arr.get(i);
        }

        return answer;
    }
}

