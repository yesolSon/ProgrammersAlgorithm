package Programmers_intro.Day12;
//숨어있는 숫자의 덧셈

public class Intro47 {
    public int solution(String my_string) {
        int answer = 0;
        int[] math={0,1,2,3,4,5,6,7,8,9};

        for(int i=0;i<my_string.length();i++){
            int one = my_string.charAt(i)-'0';
            for(int m:math){
                if(one==m){
                    answer+=one;
                }
            }
        }
        return answer;
    }
}
