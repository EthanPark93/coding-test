// stream 문법으로 가독성 좋게 표현할 수 있다. 또한, 전체 배열을 순회하지 않아 효율적이라고 생각할 수 있지만
// anyMatch 메서드가 배열이 클때 전체를 순회해서 비효율적인게 아니라, 배열을 stream으로 변환하는 과정이 비효율적인 것이다.
// 기본 for 루프를 통해 조건 충족시 루프를 바로 종료할 수 있으며, stream 객체로 변환하는 과정이 필요없기에 더 효율적이다.

package lv0;

import java.util.Arrays;

public class 정수찾기 {
    public int solution(int[] num_list, int n) {
        return Arrays.stream(num_list).anyMatch(i -> i == n) ? 1 : 0;
    }
}

//public class 정수찾기 {
//    public int solution(int[] num_list, int n) {
//        for (int num : num_list) if (num == n) return 1;
//        return 0;
//    }
//}
