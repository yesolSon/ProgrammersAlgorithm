package Programmers_intro.Day09;
//구슬을 나누는 경우의 수
public class Intro36 {
    public int solution(int balls, int share) {
        return combination(balls, share);
    }

    public static int combination(int balls, int share) {
        if (balls == share || share == 0) return 1;
        return combination((balls - 1), (share - 1)) + combination(balls - 1, share);
    }
}
