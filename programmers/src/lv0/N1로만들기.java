// 첫 번째 방식은 스트림을 순회하며 조건에 맞는 횟수를 구하고 누적합으로 계산하는 방식.
// 두 번째는 바이너리 스트링으로 바꾸어 해결하는 방식으로 코드에 대한 원초적인 이해가 필요.

package lv0;

import java.util.Arrays;

public class N1로만들기 {
    public int solution(int[] numList) {
        return Arrays.stream(numList)
                .map(this::countActions)
                .sum();
    }

    private int countActions(int n) {
        int actions = 0;

        while (n > 1) {
            if (n % 2 == 0) {
                n /= 2;
            } else {
                n = (n - 1) / 2;
            }
            actions++;
        }

        return actions;
    }
}

//class N1로만들기 {
//    public int solution(int[] num_list) {
//        return Arrays.stream(num_list).map(i -> Integer.toBinaryString(i).length() - 1).sum();
//    }
//}
