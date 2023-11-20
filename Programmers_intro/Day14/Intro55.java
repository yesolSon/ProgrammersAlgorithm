package Programmers_intro.Day14;
//암호 해독

import java.util.*;

public class Intro55 {
    public String solution(String cipher, int code) {
        String answer = "";

        List<String> arr = new ArrayList<>();

        for(int i=0; i<cipher.length();i++){
            arr.add(cipher.substring(i,i+1));
        }

        for(int i=1; i<arr.size()+1;i++){
            if(i%code==0){
                answer+=arr.get(i-1);
            }
        }



        return answer;
    }
}
