package Programmers_basic.Day2;
//덧셈식 출력하기

import java.util.Scanner;

/*
두 정수`a`,`b`가 주어질 때
다음과 같은 형태의 계산식을 출력하는 코드를 작성해 보세요.
`a + b = c`
*/
public class Basic6 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(a+" + "+b+" = "+(a+b));
    }
}
