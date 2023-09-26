package Programmers_basic.Day8;
//간단한 논리 연산

public class Basic36 {
    public boolean solution(boolean x1, boolean x2, boolean x3, boolean x4) {
        boolean answer = true;
        boolean res1 = true;
        boolean res2 = true;
        if(x1==true && x2==true || x1==true && x2==false || x1==false && x2==true){
            res1=true;
        }else{
            res1=false;
        }
        if(x3==true && x4==true || x3==true && x4==false || x3==false && x4==true){
            res2=true;
        }else{
            res2=false;
        }
        if(res1==true && res2==true){
            answer=true;
        }else{
            answer=false;
        }
        return answer;
    }
}
