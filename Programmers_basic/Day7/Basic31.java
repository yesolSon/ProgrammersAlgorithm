package Programmers_basic.Day7;
// 수열과 구간 쿼리4

public class Basic31 {
    public int[] solution(int[] arr, int[][] queries) {

        for(int[] query : queries){
            for(int i=query[0]; i<=query[1];i++){
                if(i%query[2]==0){
                    arr[i]+=1;
                }
            }
        }
        return arr;
    }
}
