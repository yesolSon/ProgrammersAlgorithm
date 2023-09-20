package Programmers_basic;

public class Basic28 {
    public static String solution(int[] numLog) {
        String answer = "";

        for(int i=1;i<numLog.length;i++){
            if(numLog[i]-numLog[i-1] == 1){
                answer+="w";
            }else if(numLog[i]-numLog[i-1] == -1){
                answer+="s";
            }else if(numLog[i]-numLog[i-1] == 10){
                answer+="d";
            }else if(numLog[i]-numLog[i-1] == -10){
                answer+="a";
            }
        }
        return answer;
    }

    public static void  main(String[] args){
        int[] numLog = {0, 1, 0, 10, 0, 1, 0, 10, 0, -1, -2, -1};
        System.out.println(solution(numLog));
    }
}
