package Programmers_basic.Day9;
//접미사인지 확인하기
public class Basic45 {
    public int solution(String my_string, String is_suffix) {
        int answer = 0;
        int length = my_string.length();
        String[] result = new String[length];

        for(int i=0;i<result.length;i++){
            result[i]=my_string.substring(i);
        }
        for(String res :result){
            if(is_suffix.equals(res)){
                answer=1;
                break;
            }else{
                answer=0;
            }
        }

        return answer;
    }
}
