package lv0;

public class 저주의숫자3 {
    public int solution(int n) {
        int answer = 0;

        for (int i = 1; i <= n; i++) {
            answer++;
            while (answer % 3 == 0 || ("" + answer).contains("3")) answer++;
        }

        return answer;
    }
}
