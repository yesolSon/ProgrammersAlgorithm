package Programmers_basic.Day3;
//문자열 곱하기

/*
문자열 my_string과 정수 k가 주어질 때,
my_string을 k번 반복한 문자열을 return 하는 solution 함수를 작성해 주세요

my_string	k	    result
"string"	3	"stringstringstring"
"love"	   10	"lovelovelovelovelovelovelovelovelovelove"
*/
public class Basic13 {
    public static String solution(String my_string, int k){
        String answer = "";
        for(int i=0; i<k; i++){
            answer += my_string;
        }
        return answer;
    }
    public static void main(String[] args){
        System.out.println(solution("love",10));
    }
}
