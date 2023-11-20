package Programmers_intro.Day14;
//369게임

import java.util.*;

public class Intro54 {
    public int solution(int order) {
        int answer = 0;
        List<String> arr = new ArrayList<>();
        String odr = Integer.toString(order);

        for(int i=0;i<odr.length();i++){
            arr.add(odr.substring(i,i+1));
        }


        if(odr.contains("3")|| odr.contains("6")|| odr.contains("9")){
            for(String s: arr){
                if(s.contains("3")|| s.contains("6")|| s.contains("9")){
                    answer+=1;
                }
            }
        }

        return answer;
    }
}
