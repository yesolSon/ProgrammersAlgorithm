package Programmers_basic.Day6;
//수 조작하기1
public class Basic27 {

    public static int solution(int n, String control) {

        for(int i=0; i<control.length();i++){
            String s = control.substring(i,i+1);
            switch(s){
                case "w":n = n+1; break;
                case "s":n = n-1; break;
                case "d":n = n+10; break;
                case "a":n = n-10; break;
            }
        }
        return n;
    }
    public static void main(String[] args){
        System.out.println(solution(0,"wsdawsdassw"));
    }
}
