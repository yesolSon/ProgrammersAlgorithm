package Programmers_intro.Day20;
//다항식 더하기

public class Intro80 {
    public String solution(String polynomial) {
        int xnum = 0;
        int num = 0;


        String[] s = polynomial.split(" ");

        for(int i=0;i<s.length;i++){
            if(s[i].contains("x"))
                xnum+=s[i].equals("x") ? 1 : Integer.parseInt(s[i].replaceAll("x",""));
            else if(!s[i].equals("+"))
                num+=Integer.parseInt(s[i]);
        }

        return (xnum != 0 ? xnum > 1 ? xnum + "x" : "x" : "")
                + (num != 0 ? (xnum != 0 ? " + " : "")
                + num : xnum == 0 ? "0" : "");
    }
}
