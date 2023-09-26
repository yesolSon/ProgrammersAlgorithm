package Programmers_basic.Day1;
//대소문자 바꿔서 출력하기**

import java.util.Scanner;

/*
영어 알파벳으로 이루어진 문자열str이 주어집니다.
각 알파벳을 대문자는 소문자로 소문자는 대문자로 변환해서 출력하는 코드를 작성해 보세요.

입력 #1
`aBcDeFg`
출력 #1
`AbCdEfG`
*/
public class Basic4 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        String a = sc.next();

        String result = "";
        for(int i=0; i<a.length(); i++){
            char c = a.charAt(i);
            if(Character.isLowerCase(c)){
                result+=Character.toUpperCase(c);
            }else{
                result+=Character.toLowerCase(c);
            }
        }
        System.out.println(result);
    }
}

/*
    ***charAt()

    Scanner로 입력을 받을 때는 String타입으로 밖에 받을 수 없다.
    그래서 등장한 것이 charAt()
    charAt은 String으로 저장된 문자열 중에서 한 글자만 선택해서 char타입으로 바꿔준다.
    str.charAt(index); 형태로 사용.
*/

