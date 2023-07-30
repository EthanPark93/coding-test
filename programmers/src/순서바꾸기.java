// 첫 번째 풀이는 직관적으로 두 부분 배열을 복사하고, 하나로 합치는 방법이다.
// 두 번째 방법은 인덱스 아웃바운드를 일으키고 배열크기로 나눈 나머지를 통해 순서를 바꾸어 저장하는 방법이다.

import java.util.Arrays;
import java.util.stream.IntStream;

public class 순서바꾸기 {
    public int[] solution(int[] num_list, int n) {
        return IntStream.concat(
                Arrays.stream(Arrays.copyOfRange(num_list, n, num_list.length)),
                Arrays.stream(Arrays.copyOfRange(num_list, 0, n))
        ).toArray();
    }
}

//class 순서바꾸기 {
//    public int[] solution(int[] num_list, int n) {
//        return IntStream.range(0, num_list.length).map(i -> num_list[(i + n) % num_list.length]).toArray();
//    }
//}
