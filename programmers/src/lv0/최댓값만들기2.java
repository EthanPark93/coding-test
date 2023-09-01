// 이중 루프를 통해 두 수의 가능한 곱 전체를 순회하며 최댓값을 구하는 방식이 있다.
// 다음으로, 최댓값은 같은 부호끼리의 곱이기 때문에 배열을 정렬하여 앞의 두 숫자의 곱과 뒤의 두 숫자의 곱을 비교하면 순회가 간단해진다.

package lv0;

import java.util.Arrays;

public class 최댓값만들기2 {
    public int solution(int[] numbers) {
        int max = 0;

        for (int i = 0; i < numbers.length -1; i++) {
            int t = numbers[i];
            for (int j = i + 1; j < numbers.length; j++) {
                int t2 = numbers[j];
                max = t*t2 > max ? t*t2 : max;
            }
        }

        return max;
    }
}

//class 최댓값만들기2 {
//    public int solution(int[] numbers) {
//        int len = numbers.length;
//        Arrays.sort(numbers);
//        return Math.max(numbers[0] * numbers[1], numbers[len - 2] * numbers[len - 1]);
//    }
//}
