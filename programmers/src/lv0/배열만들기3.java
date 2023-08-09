package lv0;// 구간 정보를 담은 intervals를 stream rangeClosed로 설정하고, 이 구간을 arr에 대입해서 concat 메서드로 합친다.
// 리스트를 생성하고 for 루프를 돌려 값을 추가하는 등의 코드는 가독성이 떨어진다고 판단했다.

import java.util.stream.IntStream;

public class 배열만들기3 {
    public int[] solution(int[] arr, int[][] intervals) {
        return IntStream.concat(
                IntStream.rangeClosed(intervals[0][0], intervals[0][1]).map(i -> arr[i]),
                IntStream.rangeClosed(intervals[1][0], intervals[1][1]).map(i -> arr[i])
        ).toArray();
    }
}
