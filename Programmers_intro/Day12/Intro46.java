package Programmers_intro.Day12;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//문자열 정렬하기(1)
public class Intro46 {
    public int[] solution(String my_string) {
        String[] mat = {"0","1","2","3","4","5","6","7","8","9"};
        List<Integer> arr = new ArrayList<>();


        for(int i=0; i<my_string.length();i++){
            String one = Character.toString(my_string.charAt(i));
            for(String m:mat){
                if(m.equals(one)){
                    arr.add(Integer.parseInt(one));
                }
            }
        }
        int[] answer = new int[arr.size()];
        for(int i=0;i<arr.size(); i++){
            answer[i]=arr.get(i);
        }
        Arrays.sort(answer);
        return answer;
    }
}
