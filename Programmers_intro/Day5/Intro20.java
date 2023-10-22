package Programmers_intro.Day5;
//배열 뒤집기
public class Intro20 {
    public int[] solution(int[] num_list) {

        int[] reverse = new int[num_list.length];
        for(int i=0; i<num_list.length; i++){
            reverse[i]=num_list[(num_list.length-1)-i];
        }
        return reverse;
    }
}
