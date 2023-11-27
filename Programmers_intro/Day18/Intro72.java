package Programmers_intro.Day18;
//문자열 정렬하기(2)

import java.util.Arrays;

public class Intro72 {

    public String solution(String my_string) {
        String answer = "";
        String res = "";


        for(int i=0;i<my_string.length();i++){
            res += Character.toLowerCase(my_string.charAt(i));
        }

        String[] result = res.split("");

        Arrays.sort(result);

        for(int i=0;i<result.length;i++){
            answer+=result[i];
        }

        return answer;
    }
}
