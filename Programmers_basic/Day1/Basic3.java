package Programmers_basic.Day1;
//문자열 반복해서 출력하기

import java.util.Scanner;

/*
문자열`str`과 정수`n`이 주어집니다.
`str`이`n`번 반복된 문자열을 만들어 출력하는 코드를 작성해 보세요.

입력 #1
`string 5`
출력 #1
`stringstringstringstringstring`
*/
public class Basic3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int n = sc.nextInt();

        for(int i=1; i<=n; i++){
            System.out.print(str);
        }
    }
}
