package Programmers_intro.Day14;
//가까운 수

public class Intro53 {
    public int solution(int[] array, int n) {

        int answer = 0;

        int res = Integer.MAX_VALUE;

        for(int i=0;i<array.length;i++){
            if(Math.abs(n-array[i])<res){
                res = Math.abs(n-array[i]);
                answer = array[i];

            }else if(res==Math.abs(n-array[i])&& array[i]<answer){
                answer = array[i];
            }
        }

        return answer;
    }
}
