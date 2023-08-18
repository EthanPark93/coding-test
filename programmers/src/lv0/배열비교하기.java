// 직접 if문을 사용해 리턴값을 명시하는 방법과, 미리 만들어진 campare 메서드를 이용하는 방법이 있다.
// 가독성은 두 번째 방식이 더 좋아보인다.

package lv0;

import java.util.Arrays;
import java.util.stream.IntStream;

public class 배열비교하기 {
    public int solution(int[] arr1, int[] arr2) {
        if (arr1.length != arr2.length) return arr1.length > arr2.length ? 1 : -1;
        else if (Arrays.stream(arr1).sum() > Arrays.stream(arr2).sum()) return 1;
        else return Arrays.stream(arr1).sum() < Arrays.stream(arr2).sum() ? -1 : 0;
    }
}

//class 배열비교하기 {
//    public int solution(int[] arr1, int[] arr2) {
//        int answer = Integer.compare(arr1.length, arr2.length);
//        if(answer == 0) answer = Integer.compare(IntStream.of(arr1).sum(), IntStream.of(arr2).sum());
//        return answer;
//    }
//}
