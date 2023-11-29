package Programmers_intro.Day21;
//외계어 사전

public class Intro84 {
    public int solution(String[] spell, String[] dic) {
        boolean wordCheck = false;

        for (String word : dic) {
            int count = 0;
            for (String s : spell) {
                if (word.contains(s)) count++;
            }
            if (count == spell.length) {
                wordCheck = true;
                break;
            }
        }
        return wordCheck ? 1 : 2;
    }
}
