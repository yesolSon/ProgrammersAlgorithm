package Programmers_basic.Day12;
//2의 영역

import java.util.ArrayList;
import java.util.List;

public class Basic59 {
    public int[] solution(int[] arr) {
        int firstIndex = -1;
        int lastIndex = -1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 2) {
                firstIndex = i;
                break;
            }
        }
        if (firstIndex != -1) {
            for (int i = firstIndex; i < arr.length; i++) {
                if (arr[i] == 2) {
                    lastIndex = i;
                }
            }
        }

        List<Integer> list = new ArrayList<>();
        if (firstIndex == -1) {
            list.add(-1);
        } else if (firstIndex == lastIndex) {
            list.add(2);
        } else {
            for (int i = firstIndex; i <= lastIndex; i++) {
                list.add(arr[i]);
            }
        }

        int[] answer = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }
        return answer;
    }
}
