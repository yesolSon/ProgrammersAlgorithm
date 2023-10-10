package Programmers_basic.Day7;

import java.util.*;

//배열만들기4
public class Basic35 {
    public int[] solution(int[] arr) {
        int[] stk = {};
        List<Integer> list = new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            if(list.size()==0){
                list.add(arr[i]);
            }else{
                if(arr[i]<list.get(list.size()-1)){
                    list.remove(list.size()-1);
                }else{
                    list.add(arr[i]);
                }
            }
        }
        for(int i=0; i<list.size();i++){
            stk[i]=list.get(i).intValue();
        }
        return stk;
    }
}
