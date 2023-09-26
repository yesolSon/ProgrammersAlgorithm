package Programmers_basic.Day5;
//코드 처리하기
public class Basic21 {
    public static String solution(String code) {
        String ret = "";
        int mode = 0;
        for (int i = 0; i < code.length(); i++) {
            String cd = code.substring(i, i + 1);
            if (mode == 0) {
                if (cd.equals("1")) {
                    mode = 1;
                } else {
                    if (i % 2 == 0) {
                        ret += code.charAt(i);
                    }
                }
            } else if (mode == 1) {
                if (cd.equals("1")) {
                    mode = 0;
                } else {
                    if (i % 2 == 1) {
                        ret += code.charAt(i);
                    }
                }
            }
        }
        if (ret.equals("")) {
            return "EMPTY";
        } else {
            return ret;
        }
    }

    public static void main(String[] args) {
        System.out.println(solution("abc1abc1abc"));
    }
}
