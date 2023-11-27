package Programmers_intro.Day19;
//잘라서 배열로 저장하기
public class Intro74 {
    public String[] solution(String my_str, int n){
        //9,8,7 -> 모두 cnt=3을 반환,10인 경우 4를 반환,6인 경우 2를 반환
        int cnt = (my_str.length() + n - 1) / n;
        String[] answer = new String[cnt];

        for(int i = 0; i < cnt; i++){
            int start = n * i;
            int end = 0;
            if(start + n >= my_str.length()){
                end = my_str.length();
            } else {
                end = start + n;
            }
            answer[i] = my_str.substring(start, end);
        }
        return answer;
    }
}
