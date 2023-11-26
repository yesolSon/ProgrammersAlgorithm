package Programmers_intro.Day16;
//가장 큰 수 찾기

public class Intro62 {
    public int[] solution(int[] array) {
        int[] answer = new int[2];

        answer[0]=array[0];

        for(int i=0;i<array.length;i++){
            if(answer[0]<=array[i]){
                answer[0]=array[i];
                answer[1]=i;
            }
        }

        return answer;
    }
}
