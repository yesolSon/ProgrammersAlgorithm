package Programmers_basic.Day3;
//두 수의 연산값 비교하기

/*
연산 ⊕는 두 정수에 대한 연산으로 두 정수를 붙여서 쓴 값을 반환합니다.
예를 들면 다음과 같습니다.

- 12 ⊕ 3 = 123
- 3 ⊕ 12 = 312

양의 정수`a`와`b`가 주어졌을 때,`a`⊕`b`와`2 * a * b`중 더 큰 값을 return하는 solution 함수를 완성해 주세요.
단,`a`⊕`b`와`2 * a * b`가 같으면`a`⊕`b`를 return 합니다.
*/
public class Basic15 {
    public static int solution(int a, int b){
        int answer = 0;
        String res = Integer.toString(a)+Integer.toString(b);
        int result1 = Integer.parseInt(res);
        int result2 = 2*a*b;

        if(result1>=result2){
            answer = result1;
        }else{
            answer = result2;
        }
        return answer;
    }

    public static void main(String[] args){
        System.out.println(solution(2,91));
    }
}
