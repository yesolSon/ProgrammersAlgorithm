package Programmers_basic.Day7;
//콜라츠 수열
import java.util.ArrayList;
import java.util.List;

public class Basic34 {
    public int[] solution(int n) {
        int[] answer = {};
        List<Integer> list = new ArrayList<>();
        list.add(n);
        while(true){
            if(n%2==0){
                n=n/2;
                list.add(n);
                if(n==1){
                    break;
                }else{
                    continue;
                }
            }else{
                n=3*n+1;
                list.add(n);
                if(n==1){
                    break;
                }else{
                    continue;
                }
            }
        }
        answer = new int[list.size()];
        for(int i=0; i<list.size(); i++){
            answer[i]=list.get(i).intValue();
        }

        return answer;
    }
}
