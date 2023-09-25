package lv1;

import java.util.Arrays;

public class 에산 {
    public int solution(int[] d, int budget) {
        int answer = 0;

        Arrays.sort(d);

        for (int n : d) {
            if (budget >= n) {
                budget -= n;
                answer++;
            } else {
                break;
            }
        }

        return answer;
    }
}
