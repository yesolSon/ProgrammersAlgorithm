package Programmers_basic.Day10;
//세로 읽기
import java.util.ArrayList;
import java.util.List;

public class Basic49 {
    public String solution(String my_string, int m, int c) {
        String answer = "";
        List<String> res = new ArrayList<>();

        for(int i=0;i<my_string.length();i+=m){
            String substr = my_string.substring(i,i+m);
            res.add(substr);

        }

        for(int i=0;i<res.size();i++){
            String result = res.get(i);
            answer+=result.charAt(c-1);
        }

        return answer;
    }
}
