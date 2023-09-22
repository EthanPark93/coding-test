// 이중 stream을 통해 풀이할 수 있지만, 가독성이 떨어질 수 있는 문제가 있다.

package lv0;

import java.util.stream.IntStream;

public class 합성수찾기 {
    public int solution(int n) {
        int answer = 0;

        for (int i = 1; i <= n; i++) {
            int t = 0;
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) t++;
                if (t >= 3) {
                    answer++;
                    break;
                }
            }
        }

        return answer;
    }
}

//class 합성수찾기 {
//    public int solution(int n) {
//        return (int) IntStream.rangeClosed(1, n).filter(i -> (int) IntStream.rangeClosed(1, i).filter(i2 -> i % i2 == 0).count() > 2).count();
//    }
//}
