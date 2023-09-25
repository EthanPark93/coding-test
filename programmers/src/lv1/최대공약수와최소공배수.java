package lv1;

public class 최대공약수와최소공배수 {
    public int[] solution(int n, int m) {
        int[] answer = {1, n * m};

        for (int i = 2; i <= n * m; i++) {
            if (n % i == 0 && m % i == 0) {
                answer[0] = i;
            }
            if (i % n == 0 && i % m == 0 && answer[1] > i) {
                answer[1] = i;
                break;
            }
        }
        return answer;
    }
}
