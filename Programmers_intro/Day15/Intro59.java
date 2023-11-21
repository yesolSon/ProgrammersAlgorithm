package Programmers_intro.Day15;
//한 번만 등장한 문자

import java.util.Arrays;

public class Intro59 {
    public String solution(String s) {
        String answer = "";

        String[] str = s.split("");

        Arrays.sort(str);


        for(int i=0;i<str.length;i++){
            String word = str[i];
            int res=0;
            for(int j=0;j<str.length;j++){
                if(str[j].equals(word)){
                    res+=1;
                }else{
                    continue;
                }

            }
            if(res==1){
                answer+=str[i];
            }else{
                continue;
            }

        }

        return answer;
    }
}
