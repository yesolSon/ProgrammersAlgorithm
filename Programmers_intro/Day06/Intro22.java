package Programmers_intro.Day06;
//직각삼각형 출력하기

import java.util.Scanner;

public class Intro22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i=1;i<=n;i++){
            String star = "";
            for(int j=1;j<=i;j++){
                star+="*";
            }
            System.out.println(star);
        }
    }
}
