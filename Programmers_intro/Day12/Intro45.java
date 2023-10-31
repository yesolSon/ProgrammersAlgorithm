package Programmers_intro.Day12;
//모음 제거
public class Intro45 {
    public String solution(String my_string) {
        String answer = "";
        String[] rpc = {"a","e","i","o","u"};

        for(int i=0;i<rpc.length;i++){
            if(my_string.contains(rpc[i])){
                answer=my_string.replaceAll(rpc[i],"");
                my_string=answer;
            }else{
                answer=my_string;
            }
        }

        return answer;
    }
}
