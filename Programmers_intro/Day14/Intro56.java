package Programmers_intro.Day14;
//대문자와 소문자

public class Intro56 {
    public String solution(String my_string) {
        String answer = "";

        for(int i=0;i<my_string.length();i++){
            if(Character.isUpperCase(my_string.charAt(i))){
                answer+=Character.toLowerCase(my_string.charAt(i));
            }else{
                answer+=Character.toUpperCase(my_string.charAt(i));
            }
        }

        return answer;
    }
}