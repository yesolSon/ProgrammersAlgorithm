package Programmers_basic.Day10;
//문자열의 앞의 n글자
public class Basic46 {
    public String solution(String my_string, int n) {
        String answer = "";
        answer = my_string.substring(0,n);

        return answer;
    }
}
