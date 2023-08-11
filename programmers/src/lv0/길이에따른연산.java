// stream을 사용에 배열의 길이에 따라 합연산 혹은 reduce를 사용한 곱 누적 연산을 처리한다.

package lv0;

import java.util.stream.IntStream;

public class 길이에따른연산 {
    public int solution(int[] num_list) {
        IntStream stream = IntStream.of(num_list);
        return num_list.length>10?stream.sum():stream.reduce(1, (a, b) -> a * b);
    }
}
