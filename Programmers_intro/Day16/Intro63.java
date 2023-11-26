package Programmers_intro.Day16;
//문자열 계산하기

public class Intro63 {
    public int solution(String my_string) {
        int answer = 0;
        String[] res = my_string.split(" ");

        answer+=Integer.parseInt(res[0]);

        for(int i=1;i<res.length-1;i++){

            if(res[i].equals("+")){
                answer+=Integer.parseInt(res[i+1]);
            }else if(res[i].equals("-")){
                answer-=Integer.parseInt(res[i+1]);
            }
        }

        return answer;
    }
}
