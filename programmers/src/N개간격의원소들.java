// 조건에 맞는 인덱스를 필터링 한 뒤, 배열을 맵핑한다.

import java.util.stream.IntStream;

public class N개간격의원소들 {
    public int[] solution(int[] num_list, int n) {
        return IntStream.range(0, num_list.length).filter(i -> i % n == 0).map(i -> num_list[i]).toArray();
    }
}
