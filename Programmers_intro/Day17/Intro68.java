package Programmers_intro.Day17;
//OX퀴즈

public class Intro68 {
    public String[] solution(String[] quiz) {
        String[] answer = new String[quiz.length];

        for(int i=0;i<quiz.length;i++){
            String[] res = quiz[i].split(" ");
            int x = Integer.parseInt(res[0]);
            int y = Integer.parseInt(res[2]);
            int z = Integer.parseInt(res[4]);

            if(res[1].equals("+")){

                if(x+y==z){
                    answer[i]="O";
                }else{
                    answer[i]="X";
                }
            }else{
                if(x-y==z){
                    answer[i]="O";
                }else{
                    answer[i]="X";
                }
            }
        }

        return answer;
    }
}
