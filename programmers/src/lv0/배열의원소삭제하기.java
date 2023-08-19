// Stream의 anyMatch 메서드를 사용하면 쉽게 해결할 수 있다.

package lv0;

import java.util.Arrays;

public class 배열의원소삭제하기 {
    public int[] solution(int[] arr, int[] delete_list) {
        return Arrays.stream(arr).filter(i -> !Arrays.stream(delete_list).anyMatch(s -> s == i)).toArray();
    }
}
