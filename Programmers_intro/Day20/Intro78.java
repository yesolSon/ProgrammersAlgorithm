package Programmers_intro.Day20;
//캐릭터의 좌표

public class Intro78 {
    public int[] solution(String[] keyinput, int[] board) {
        int[] answer = new int[2];
        answer[0]=0;
        answer[1]=0;

        for(int i=0;i<keyinput.length;i++){
            if(keyinput[i].equals("left")){
                if((board[0]/2)>=Math.abs(answer[0]-1)){
                    answer[0]-=1;
                }
            }else if(keyinput[i].equals("right")){
                if((board[0]/2)>=Math.abs(answer[0]+1)){
                    answer[0]+=1;
                }
            }else if(keyinput[i].equals("up")){
                if((board[1]/2)>=Math.abs(answer[1]+1)){
                    answer[1]+=1;
                }
            }else{
                if((board[1]/2)>=Math.abs(answer[1]-1)){
                    answer[1]-=1;
                }
            }
        }

        return answer;
    }
}
