package Programmers_intro.Day11;
//최댓값 만들기(1)

public class Intro43 {
    public int solution(int[] numbers) {
        int answer = 0;
        int res = 0;

        for(int i=0;i<numbers.length;i++){
            for(int j=0; j<numbers.length;j++){
                if(i!=j){
                    res=numbers[i]*numbers[j];
                }
                if(res>answer){
                    answer=res;
                }
            }
        }
        return answer;
    }
}
