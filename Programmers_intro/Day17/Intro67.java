package Programmers_intro.Day17;
//자릿수 더하기

public class Intro67 {
    public int solution(int n) {
        int answer = 0;

        String s = Integer.toString(n);
        String[] res = s.split("");

        for(int i=0;i<res.length;i++){
            answer+=Integer.parseInt(res[i]);
        }

        return answer;
    }
}
