package lv0;

public class 주사위게임1 {
    public int solution(int a, int b) {
        if (a % 2 == 1 && b % 2 == 1) return (a * a) + (b * b);
        else if (a % 2 == 0 && b % 2 == 0) return a - b >= 0 ? a - b : (a - b) * -1;
        else return 2 * (a + b);
    }
}
