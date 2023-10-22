package Programmers_intro.Day3;
//짝수는 싫어요
import java.util.ArrayList;
import java.util.List;

public class Intro12 {
    public int[] solution(int n) {

        List<Integer> arr = new ArrayList<>();

        for(int i=0; i<=n; i++){
            if(i%2==1){
                arr.add(i);
            }
        }

        int[] answer = new int[arr.size()];
        for(int i=0; i<arr.size(); i++){
            answer[i]=arr.get(i);
        }
        return answer;
    }
}
