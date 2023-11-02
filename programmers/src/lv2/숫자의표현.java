package lv2;

public class 숫자의표현 {
    public int solution(int n) {
        int answer = 1;
        for (int i = 1; i < n; i++) {
            int num = i;
            for (int j = i + 1; j <= n; j++) {
                num += j;
                if (num == n) {
                    answer++;
                    break;
                } else if (num > n) {
                    break;
                }
            }
        }
        return answer;
    }
}
