package Programmers_basic.Day11;
//배열 만들기1
import java.util.ArrayList;
import java.util.List;

public class Basic52 {
    public int[] solution(int n, int k) {
        List<Integer> arr= new ArrayList();
        for(int i=1; i<=n; i++){
            if(i%k==0){
                arr.add(i);
            }
        }
        int[] answer = new int[arr.size()];
        for(int i=0;i<arr.size();i++){
            answer[i]=arr.get(i);
        }
        return answer;
    }
}
