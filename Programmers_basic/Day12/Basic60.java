package Programmers_basic.Day12;
//배열 조각하기
import java.util.ArrayList;

public class Basic60 {
    public int[] solution(int[] arr, int[] query) {
        ArrayList<Integer> list = new ArrayList<>();

        for(int num: arr){
            list.add(num);
        }

        for(int i=0; i<query.length; i++){
            if(i%2==0){
                list.remove(query[i]+1);
            }else if(i%2==1){
                list.remove(query[i]-1);
            }
        }
        int[] answer = new int[list.size()];
        for(int i=0; i<list.size();i++){
            answer[i]= list.get(i);
        }

        return answer;
    }

}
