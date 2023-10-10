package Programmers_basic.Day10;
//접두사인지 확인하기
public class Basic47 {
    public int solution(String my_string, String is_prefix) {
        int answer = 0;
        int length = my_string.length();
        String[] res = new String[length];

        for(int i=1;i<my_string.length();i++){
            res[i] = my_string.substring(0,i);
        }
        for(int i=0; i<res.length;i++){
            if(is_prefix.equals(res[i])){
                answer=1;
                break;
            }else{
                answer=0;
            }
        }

        return answer;
    }
}
