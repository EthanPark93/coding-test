package lv1;

public class 약수의갯수와덧셈 {
    public int solution(int left, int right) {
        int answer = 0;

        for (int i = left; i <= right; i++) {
            int t = 0;

            for (int j = 1; j <= i; j++) {
                if (i % j == 0) t++;
            }
            answer += t % 2 == 0 ? i : i * -1;
        }

        return answer;
    }
}
