// 가능한 등수를 인덱스로 filter한 이후 rank에 해당하는 요소의 크기로 정렬한다. 인덱스값을 훼손하지 않기 때문에
// 인덱스 위치 정보를 유지할 수 있다. 이를 3개로 제한하고 100 곱하고 다음값을 더해 감소연산 처리로 리턴 값을 찾을 수 있다.

package lv0;

import java.util.Comparator;
import java.util.stream.IntStream;

class 전국대회선발고사 {
    public int solution(int[] rank, boolean[] attendance) {
        return IntStream.range(0, rank.length)
                .filter(i -> attendance[i])
                .boxed()
                .sorted(Comparator.comparing(i -> rank[i]))
                .limit(3)
                .reduce((current, next) -> current * 100 + next)
                .get();
    }
}
