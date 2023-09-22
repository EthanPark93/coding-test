package lv0;

public class 팩토리얼 {
    public int solution(int n) {
        int sum = 1;
        for (int i = 1; ; i++) {
            sum *= i;
            if (sum > n) return i - 1;
        }
    }
}
