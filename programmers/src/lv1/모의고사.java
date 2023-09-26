package lv1;

import java.util.Arrays;
import java.util.stream.IntStream;

public class 모의고사 {
    public int[] solution(int[] answers) {
        int[][] solver = {
                {1, 2, 3, 4, 5},
                {2, 1, 2, 3, 2, 4, 2, 5},
                {3, 3, 1, 1, 2, 2, 4, 4, 5, 5}
        };
        int[] answer = new int[solver.length];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < answers.length; j++) {
                if (answers[j] == solver[i][j % solver[i].length]) answer[i]++;
            }
        }

        int max = Arrays.stream(answer).max().orElse(-1);

        return IntStream.range(1, 4).filter(i -> answer[i-1] == max).toArray();
    }
}
