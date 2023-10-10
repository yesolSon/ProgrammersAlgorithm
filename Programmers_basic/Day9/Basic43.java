package Programmers_basic.Day9;
// 문자열 뒤의 n글자
public class Basic43 {
    public String solution(String my_string, int n) {
        String answer = "";
        answer = my_string.substring(my_string.length()-n,my_string.length());

        return answer;
    }
}
