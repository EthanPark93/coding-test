// 첫 번째 방법은 2의 거듭제곱이면서 arr의 길이보다 같거나 큰 조건값을 구하여 복사하는 방식이다.
// 두 번째 방법은 복사방식은 같으나, 조건 k의 제곱값을 log를 이용한 방식으로 구하여 pow를 이용해 제곱하고 k값을 찾는다.

package lv0;

import java.util.Arrays;

public class 배열의길이를2의거듭제곱으로만들기 {
    public int[] solution(int[] arr) {
        int k = 1;
        while (k < arr.length) k *= 2;

        return Arrays.copyOf(arr, k);
    }
}

//class 배열의길이를2의거듭제곱으로만들기 {
//    public int[] solution(int[] arr) {
//        return Arrays.copyOf(arr, (int) Math.pow(2, Math.ceil(Math.log(arr.length) / Math.log(2))));
//    }
//}
