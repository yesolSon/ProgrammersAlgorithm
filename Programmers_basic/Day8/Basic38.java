package Programmers_basic.Day8;
//글자 이어 붙여 문자열 만들기

public class Basic38 {
    public String solution(String my_string, int[] index_list) {
        String answer = "";

        for(int i=0;i<index_list.length;i++){
            int j=index_list[i];
            answer+=my_string.charAt(j);
        }

        return answer;
    }
}
