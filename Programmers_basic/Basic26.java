package Programmers_basic;
//마지막 두 원소

import java.util.ArrayList;
import java.util.List;

public class Basic26 {
    public static List solution(int[] num_list) {
        int lastIndex = num_list.length-1;
        List<Integer> newArr = new ArrayList<>();
        for(int i=0;i<num_list.length;i++){
            newArr.add(num_list[i]);
        }

        if(num_list[lastIndex] > num_list[lastIndex-1]){
            int append = num_list[lastIndex]-num_list[lastIndex-1];
            newArr.add(append);
        }else{
            int append = num_list[lastIndex]*2;
            newArr.add(append);
        }

        return newArr;
    }

    public static void main(String[] args){
        int[] num_list = {2, 1, 6};
        System.out.println(solution(num_list));
    }
}
