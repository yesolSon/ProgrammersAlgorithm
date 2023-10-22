package Programmers_intro.Day5;
//옷가게 할인받기
public class Intro17 {
    public int solution(int price) {
        int answer = 0;
        double res = 0;
        if(price>=100000 && price<300000){
            res = price*0.95;
        }else if(price>=300000 && price <500000){
            res = price*0.9;
        }else if(price>=500000){
            res = price*0.8;
        }else{
            res = price;
        }
        answer = (int)res;
        return answer;
    }
}
