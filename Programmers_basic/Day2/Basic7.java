package Programmers_basic.Day2;
//문자열 붙여서 출력하기**

import java.util.Scanner;

/*
두 개의 문자열`str1`,`str2`가 공백으로 구분되어 입력으로 주어집니다.
입출력 예와 같이`str1`과`str2`을 이어서 출력하는 코드를 작성해 보세요.

입력 #1
`apple pen`
출력 #1
`applepen`

입력 #2
`Hello World!`
출력 #2
`HelloWorld!`
*/
public class Basic7 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
//        String a = sc.next();
//        String b = sc.next();
//        String result = a+b;
//
//        System.out.println(result.trim());

        String str = sc.nextLine();
        System.out.println(str.replaceAll(" ",""));

    }
}
