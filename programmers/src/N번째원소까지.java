// 부분 배열을 리턴하면 된다.
// 두 번째 방법은 stream 문법 연습.

import java.util.Arrays;
import java.util.stream.IntStream;
public class N번째원소까지 {
    public int[] solution(int[] num_list, int n) {
        return Arrays.copyOfRange(num_list,0,n);
    }
}

//class N번째원소까지 {
//    public int[] solution(int[] num_list, int n) {
//        return IntStream.range(0,n).map(i -> num_list[i]).toArray();
//    }
//}
