package Programmers_basic.Day8;
//9로 나눈 나머지

public class Basic39 {
    public int solution(String number) {
        int answer = 0;
        for(int i=0; i<number.length();i++){
            answer+=number.charAt(i)-'0';
        }
        return answer%9;
    }
}
//문자인 숫자를 char에서 int로 변환시키면 아스키코드로 변환된다. 1은 49가 됨
/*
'0'(char) -> 48
'1'(char) -> 49
'2'(char) -> 50
'3'(char) -> 51
'4'(char) -> 52

따라서 (int) num.charAt(0) + (int) num.charAt(1) 의 값은 99으로 출력된다.

이 때 -'0'(48)을 해주면

48 - 48('0') = 0
49 - 48('0') = 1
50 - 48('0') = 2
51 - 48('0') = 3
52 - 48('0') = 4

CharAt(int i) - '0'을 통해 char형의 문자들을 int형으로 변환시킬 수 있다.

 */