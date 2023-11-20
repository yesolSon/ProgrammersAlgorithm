package Programmers_intro.Day13;
//컨트롤 제트
public class Into49 {
    public int solution(String s) {
        int answer = 0;

        String[] arr = s.split(" ");
        for(int i=0;i<arr.length;i++){
            if(arr[i].equals("Z")){
                answer-= Integer.parseInt(arr[i-1]);
                continue;
            }
            answer+= Integer.parseInt(arr[i]);
        }

        return answer;
    }
}
