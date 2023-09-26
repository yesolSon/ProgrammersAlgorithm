package Programmers_basic.Day6;
//수열과 구간 쿼리3

public class Basic29 {
    public static int[] solution(int[] arr, int[][] queries) {

        for(int[] query: queries){
            int i = query[0];
            int j = query[1];
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
        return arr;
    }

    public static void main(String[] args){
        int[] arr = {0, 1, 2, 3, 4};
        int[][] queries = {{0, 3},{1, 2},{1, 4}};
        //걍 객체 위치가 나오네
        System.out.println(solution(arr,queries));

    }
}
