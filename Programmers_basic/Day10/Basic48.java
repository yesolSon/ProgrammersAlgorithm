package Programmers_basic.Day10;
//문자열 뒤집기
public class Basic48 {
    public String solution(String my_string, int s, int e) {
        String answer = "";
        int length = e-s;
        String[] res = new String[length];

        answer+=my_string.substring(0,s);

        for(int i=e;i>=s;i--){
            answer+=my_string.charAt(i);
        }

        answer+=my_string.substring(e+1,my_string.length());

        return answer;
    }
}
