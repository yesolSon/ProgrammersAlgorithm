package Programmers_basic;
//문자열 겹쳐쓰기

import java.util.Scanner;

/*
문자열 my_string, overwrite_string과 정수 s가 주어집니다.
문자열 my_string의 인덱스 s부터 overwrite_string의 길이만큼을
문자열 overwrite_string으로 바꾼 문자열을 return 하는 solution 함수를 작성해 주세요.

입출력 예
my_string	      overwrite_string	  s	   result
"He11oWor1d"	      "lloWorl"	      2	 "HelloWorld"
"Program29b8UYPPP"	  "merS123"   	  7	 "ProgrammerS123PP"
*/
public class Basic10 {
    public static String solution(String my_string, String overwrite_string, int s){
        String answer = "";

        answer = my_string.substring(0,s); //Program
        answer += overwrite_string;         //merS123
        answer += my_string.substring(s+overwrite_string.length(),my_string.length());
                                        //7+7(인덱스),16
        return answer;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String my_string = sc.next();
        String overwrite_string = sc.next();
        int s = sc.nextInt();

        String result = solution(my_string,overwrite_string,s);
        System.out.println(result);
    }
}
