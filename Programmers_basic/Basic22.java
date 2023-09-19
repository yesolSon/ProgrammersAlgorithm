package Programmers_basic;
//등차수열의 특정 항만 더하기
public class Basic22 {
    public static int solution(int a, int d, boolean[] included) {
        int answer = 0;
        for(int i=0;i<included.length;i++){
            if(included[i]==true){
                answer+=(a+(d*i));
            }
        }
        return answer;
    }

    public static void main(String[] args){
        boolean[] included={true, false, false, true, true};
        System.out.println(solution(3,4,included));
    }
}
