package Programmers_intro.Day07;
//특정 문자 제거하기
public class Intro25 {
    public String solution(String my_string, String letter) {
        String answer = "";
        answer = my_string.replaceAll(letter,"");

        return answer;
    }
}
