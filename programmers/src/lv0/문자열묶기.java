// 모든 문자열 길이 구간에 대해 IntStream으로 각각 갯수를 카운트해서 map한다.
// 그 중 최댓값을 리턴하고 값이 존재하지 않으면 0을 리턴한다.

package lv0;

import java.util.Arrays;
import java.util.stream.IntStream;

public class 문자열묶기 {
    public int solution(String[] strArr) {
        return IntStream.range(1, 31)
                .map(i -> (int) Arrays.stream(strArr).filter(n -> n.length() == i).count())
                .max().orElse(0);
    }
}
