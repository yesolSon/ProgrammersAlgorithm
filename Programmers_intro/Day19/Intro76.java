package Programmers_intro.Day19;
//머쓱이보다 키가 큰 사람
public class Intro76 {
    public int solution(int[] array, int height) {
        int answer = 0;

        for(int i=0;i<array.length;i++){
            if(array[i]>height){
                answer++;
            }
        }

        return answer;
    }
}
