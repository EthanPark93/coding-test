package lv0;// stream 문법을 사용해, 2값을 나타내는 인덱스 배열을 만든다.
// 배열의 크기가 0이면 -1배열을 반환하고, 크기가 1 이상이면 시작 인덱스는 인덱스 배열의 0번째,
// 마지막 인덱스는 인덱스 배열의 마지막 값 +1이다. (열린 구간이기 때문에 +1을 해주어야 함.)

import java.util.Arrays;
import java.util.stream.IntStream;

public class N2의영역 {
    public int[] solution(int[] arr) {
        int[] indexAr = IntStream.range(0, arr.length)
                .filter(i -> arr[i] == 2)
                .toArray();

        return indexAr.length == 0 ? new int[]{-1} : Arrays.copyOfRange(arr, indexAr[0], indexAr[indexAr.length - 1] + 1);
    }
}
