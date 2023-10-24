package Programmers_intro.Day06;
//문자 반복 출력하기

public class Intro24 {
    public String solution(String my_string, int n) {
        String answer = "";

        for(int i=0; i<my_string.length();i++){
            for(int j=1; j<=n; j++){
                answer+=my_string.charAt(i);
            }
        }
        return answer;
    }
}
