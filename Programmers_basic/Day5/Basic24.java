package Programmers_basic.Day5;
//원소들의 곱과 합
public class Basic24 {
    public static int solution(int[] num_list) {
        int answer = 0;
        int mul = 1;
        int plus = 0;
        for(int i=0;i<num_list.length;i++){
            mul = mul*num_list[i];
            plus = plus+num_list[i];
        }
        if(mul<(plus*plus)){
            answer=1;
        }else{
            answer=0;
        }
        return answer;
    }

    public static void main(String[] args){
        int[] num_list = {3, 4, 5, 2, 1};
        System.out.println(solution(num_list));
    }
}
