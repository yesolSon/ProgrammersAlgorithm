package Programmers_basic.Day9;
//접미사 배열
import java.util.Arrays;

public class Basic44 {
    public String[] solution(String my_string) {

        int length = my_string.length();
        String[] result = new String[length];

        for(int i=0;i<my_string.length();i++){
            result[i] = my_string.substring(i);
        }
        Arrays.sort(result);


        return result;
    }
}
