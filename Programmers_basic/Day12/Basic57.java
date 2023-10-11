package Programmers_basic.Day12;
//첫번째로 나오는 음수
public class Basic57 {
    public int solution(int[] num_list) {
        int answer = 0;

        for(int i=0; i<num_list.length;i++){
            if(num_list[i]<0){
                answer=i;
                break;
                //만약 break되지 않고, 마지막인덱스마저 양수라면~
            }else if(num_list[i]>=0 && num_list[num_list.length-1]>0){
                answer=-1;
            }
        }
        return answer;
    }
}
