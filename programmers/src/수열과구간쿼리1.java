// 첫 번째 방식은 기본 for루프를 사용해 구간을 정의하고 배열을 재정의한다.
// 두 번째 방식은 foreach문을 사용하고 내부 루프는 stream으로 간결한 문법을 사용할 수 있다.

import java.util.stream.IntStream;

public class 수열과구간쿼리1 {
    public int[] solution(int[] arr, int[][] queries) {
        for (int i = 0; i < queries.length; i++) {
            for (int j = queries[i][0]; j <= queries[i][1]; j++) {
                arr[j]++;
            }
        }
        return arr;
    }
}

//public class 수열과구간쿼리1 {
//    public int[] solution(int[] arr, int[][] queries) {
//        for (int[] query : queries) {
//            IntStream.rangeClosed(query[0], query[1]).forEach(i -> arr[i]++);
//        }
//        return arr;
//    }
//}