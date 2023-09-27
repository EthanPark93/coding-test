package lv1;

import java.util.Comparator;
import java.util.stream.IntStream;

public class 실패율 {
    public int[] solution(int N, int[] stages) {
        double[] fail = new double[N];
        double user = stages.length;

        for (int i = 0; i < stages.length; i++) {
            if (stages[i] < N+1) fail[stages[i]-1]++;
        }

        for (int i = 0; i < fail.length; i++) {
            if (fail[i] != 0) {
                double t = fail[i];
                fail[i] /= user;
                user -= t;
            }
        }

        return IntStream.rangeClosed(1, N)
                .boxed()
                .sorted(Comparator.comparingDouble(i -> -fail[i-1]))
                .mapToInt(Integer::intValue)
                .toArray();
    }
}
