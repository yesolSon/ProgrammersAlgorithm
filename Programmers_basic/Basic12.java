package Programmers_basic;
//문자리스트를 문자열로 변환하기

import java.util.ArrayList;

/*
문자들이 담겨있는 배열arr가 주어집니다.
arr의 원소들을 순서대로 이어 붙인 문자열을 return 하는 solution함수를 작성해 주세요.

arr	             result
["a","b","c"]	 "abc"
*/
public class Basic12 {

    public static String solution(String[] arr){
        String answer = "";

        for(int i=0;i<arr.length;i++){
            answer+=arr[i];
        }
        return answer;
    }

    public static void main(String[] args){
        String[] arr = {"a","b","c"};
        System.out.println(solution(arr));

    }
}
