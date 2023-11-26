package Programmers_intro.Day17;
//숫자 찾기

public class Intro65 {
    public int solution(int num, int k) {
        int answer = 0;

        String n = Integer.toString(num);
        String kk = Integer.toString(k);

        if(n.indexOf(kk)==-1){
            answer=-1;
        }else{
            answer=n.indexOf(kk)+1;
        }

        return answer;
    }
}
