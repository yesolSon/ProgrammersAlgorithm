package Programmers_basic.Day12;
//리스트 자르기
import java.util.ArrayList;
import java.util.List;

public class Basic56 {
    public int[] solution(int n, int[] slicer, int[] num_list) {
        List<Integer> arr = new ArrayList<>();
        int a = slicer[0];
        int b = slicer[1];
        int c = slicer[2];

        switch(n){
            case 1:
                for(int i=0; i<=b;i++){
                    arr.add(num_list[i]);
                }
                break;
            case 2:
                for(int i=a; i<num_list.length;i++){
                    arr.add(num_list[i]);
                }
                break;
            case 3:
                for(int i=a; i<=b;i++){
                    arr.add(num_list[i]);
                }
                break;
            case 4:
                for(int i=a; i<=b; i+=c){
                    arr.add(num_list[i]);
                }
                break;
        }

        int[] answer = new int[arr.size()];
        for(int i=0; i<arr.size();i++){
            answer[i]=arr.get(i);
        }
        return answer;
    }
}
