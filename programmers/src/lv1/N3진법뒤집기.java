package lv1;

public class N3진법뒤집기 {
    public int solution(int n) {
        return Integer.parseInt(new StringBuilder(Integer.toString(n,3)).reverse().toString(), 3);
    }
}
