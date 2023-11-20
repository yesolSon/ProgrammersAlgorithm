package Programmers_intro.Day15;
//인덱스 바꾸기

public class Intro58 {
    public String solution(String my_string, int num1, int num2) {
        String answer = "";
        String temp = "";

        String[] str = my_string.split("");

        temp = str[num1];
        str[num1]=str[num2];
        str[num2]=temp;

        for(int i=0;i<str.length;i++){
            answer+=str[i];
        }

        return answer;
    }
}
