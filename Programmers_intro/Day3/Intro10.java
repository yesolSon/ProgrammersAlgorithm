package Programmers_intro.Day3;
//중앙값 구하기
import java.util.Arrays;

public class Intro10 {
    public int solution(int[] array) {
        int answer = 0;
        Arrays.sort(array);

        int index = array.length/2;
        answer = array[index];

        return answer;
    }
}
