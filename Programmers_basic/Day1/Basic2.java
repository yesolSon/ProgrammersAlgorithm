package Programmers_basic.Day1;
//a와 b 출력하기

/*
* 정수a와 b가 주어집니다.
* 각 수를 입력받아 입출력 예와 같은 형식으로 출력하는 코드를 작성해 보세요.

---
### 입출력 예
입력 #1
`4 5`
출력 #1
`a = 4
b = 5`*/

import java.util.Scanner;

public class Basic2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println("a = "+a);
        System.out.println("b = "+b);
    }

}
