package Programmers_intro.Day13;
//중복된 문자 제거
public class Into51 {
    public String solution(String my_string) {
        String answer = "";

        for(int i=0;i<my_string.length();i++){
            String word = my_string.substring(i,i+1);
            if(!answer.contains(word)){
                answer+=word;
            }
        }

        return answer;
    }
}
