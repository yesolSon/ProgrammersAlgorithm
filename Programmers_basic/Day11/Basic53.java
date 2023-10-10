package Programmers_basic.Day11;
//글자 지우기
import java.util.Arrays;

public class Basic53 {
    public String solution(String my_string, int[] indices) {
        StringBuilder stringBuilder = new StringBuilder(my_string);

        Arrays.sort(indices);
        for (int i = indices.length - 1; i >= 0; i--) {
            int index = indices[i];
            stringBuilder.deleteCharAt(index);

        }
        String answer = stringBuilder.toString();

        return answer;
    }
}
