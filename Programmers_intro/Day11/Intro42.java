package Programmers_intro.Day11;
//합성수 구하기
public class Intro42 {
    public int solution(int n) {
        int answer = 0;

        for(int i=1;i<=n;i++){
            int cnt = 0;
            for(int j=1; j<=i; j++){
                if(i%j==0){
                    cnt++;
                }
            }
            if(cnt>=3){
                answer++;
            }
        }

        return answer;
    }
}
