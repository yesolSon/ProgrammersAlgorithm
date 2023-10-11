package Programmers_basic.Day12;

import java.util.ArrayList;
import java.util.List;

//배열만들기3
public class Basic58 {
    public int[] solution(int[] arr, int[][] intervals) {
        List<Integer> array = new ArrayList<>();

        //첫번째구간
        for(int i=intervals[0][0]; i<=intervals[0][1]; i++){
            array.add(arr[i]);
        }
        //두번째구간
        for(int i=intervals[1][0]; i<=intervals[1][1]; i++){
            array.add(arr[i]);
        }

        int[] answer = new int[array.size()];
        for(int i=0; i<array.size(); i++){
            answer[i]=array.get(i);
        }

        return answer;
    }
}
