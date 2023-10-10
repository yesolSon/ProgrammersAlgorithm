package Programmers_basic.Day10;
//qr code
public class Basic50 {
    public String solution(int q, int r, String code) {
        String answer = "";

        for(int i=0; i<code.length();i++){
            if(i%q==r){
                answer+=code.charAt(i);
            }
        }
        return answer;
    }
}
