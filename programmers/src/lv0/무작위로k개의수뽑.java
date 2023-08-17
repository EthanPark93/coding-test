// arr를 distinct로 중복제거, 0부터 k-1까지 범위의 스트림을 -1로 채운 뒤
// concat으로 합치고, limit을 이용해 크기를 k로 제한하여 배열로 반환한다.

package lv0;

import java.util.Arrays;
import java.util.stream.IntStream;

public class 무작위로k개의수뽑 {
    public int[] solution(int[] arr, int k) {
        return IntStream.concat(Arrays.stream(arr).distinct(), IntStream.range(0, k).map(i -> -1)).limit(k).toArray();
    }
}
