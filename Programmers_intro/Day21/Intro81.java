package Programmers_intro.Day21;
//숨어있는 숫자의 덧셈(2)

public class Intro81 {
    public int solution(String my_string) {
        int answer = 0;

        //String[] str = my_string.split("[a-zA-Z]")

        my_string = my_string.replaceAll("[^\\d]"," ");
        String[] str = my_string.split(" ");

        for(String s: str){
            answer+= (!s.isEmpty()) ? Integer.parseInt(s) : 0;
        }

        return answer;
    }
}
