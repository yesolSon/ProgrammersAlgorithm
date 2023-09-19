package Programmers_basic;
//이어붙인 수
public class Basic25 {
    public static int solution(int[] num_list) {
        String res1 = "";
        String res2 = "";
        for(int i=0;i<num_list.length;i++){
            if(num_list[i]%2==0){
                String even = Integer.toString(num_list[i]);
                res1 += even;
            }else{
                String odd = Integer.toString(num_list[i]);
                res2 += odd;
            }
        }
        return Integer.parseInt(res1)+Integer.parseInt(res2);
    }

    public static void main(String[] args){
        int[] num_list = {3, 4, 5, 2, 1};
        System.out.println(solution(num_list));
    }
}
