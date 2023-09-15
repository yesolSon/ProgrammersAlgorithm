package Programmers_basic;

//문자열 출력하기.
/*
문자열`str`이 주어질 때,`str`을 출력하는 코드를 작성해 보세요.
---
### 입출력 예

입력 #1
`HelloWorld!`
출력 #1
`HelloWorld!`*/

import java.util.Scanner;

public class Basic1_scanner {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        int str = a.length();
        if(1<=str && str<=1000000){
            System.out.println(a);
        }
    }
}
