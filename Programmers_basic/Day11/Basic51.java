package Programmers_basic.Day11;
//문자 개수 세기
public class Basic51 {
    public int[] solution(String my_string) {
        int[] answer = new int[52];

        for(int i=0; i<my_string.length();i++){
            char alp = my_string.charAt(i);
            if(alp >= 'A' && alp <='Z'){
                answer[alp-'A']++;
            }else if(alp >='a' && alp <= 'z'){
                answer[26+alp-'a']++;
            }
        }
        return answer;
    }
}
