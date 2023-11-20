package Programmers_intro.Day15;
//영어가 싫어요

public class Intro57 {
    public long solution(String numbers) {
        long answer = 0;

        String[] match = {"zero","one","two","three","four","five","six","seven","eight","nine"};

        for(int i=0;i<match.length;i++){
            numbers = numbers.replaceAll(match[i],String.valueOf(i));
        }

        answer = Long.parseLong(numbers);
        return answer;
    }}
