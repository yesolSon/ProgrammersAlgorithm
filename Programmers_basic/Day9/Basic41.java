package Programmers_basic.Day9;
//배열만들기5
import java.util.ArrayList;
import java.util.List;

public class Basic41 {
    public int[] solution(String[] intStrs, int k, int s, int l) {
        List<Integer> intRes = new ArrayList();

        for(String sub:intStrs){
            int result = Integer.parseInt(sub.substring(s,s+l));
            if(result>k){
                intRes.add(result);
            }
        }
        int[] answer = new int[intRes.size()];
        for(int i=0; i<intRes.size();i++){
            answer[i]=intRes.get(i);
        }
        return answer;
    }

}
