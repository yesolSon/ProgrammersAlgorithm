package Programmers_basic;
//문자열 섞기

/*
길이가 같은 두 문자열`str1`과`str2`가 주어집니다.
두 문자열의 각 문자가 앞에서부터 서로 번갈아가면서 한 번씩 등장하는 문자열을 만들어
 return 하는 solution 함수를 완성해 주세요.

 str1	  str2	       result
"aaaaa"	 "bbbbb"	"ababababab"
*/

import java.util.Scanner;

public class Basic11 {
    public static String solution(String str1, String str2){
        String answer = "";

        for(int i=0; i<str1.length();i++){
            answer += str1.substring(i,i+1);
            answer += str2.substring(i,i+1);
        }
        return answer;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str1 = sc.next();
        String str2 = sc.next();

        System.out.println(solution(str1,str2));
    }
}
