package Programmers_intro.Day09;
//모스부호(1)
public class Intro34 {
    public String solution(String letter) {
        String answer = "";

        String[] morseList = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};

        String[] morse;
        morse = letter.split(" ");

        for(String s:morse){
            for(int i=0; i<morseList.length; i++){
                if(s.equals(morseList[i])){
                    answer+=Character.toString(i+'a');
                }
            }
        }
        return answer;
    }
}
