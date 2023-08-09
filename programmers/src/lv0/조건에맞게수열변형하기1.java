package lv0;// 배열을 순회하며 조건에 해당하는 요소에 알맞은 재할당을 해준다.
// stream문을 사용할 수는 있지만, 삼항식 안에 중첩하게되면 가독성이 떨어진다.

import java.util.Arrays;

public class 조건에맞게수열변형하기1 {
    public int[] solution(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= 50 && arr[i] % 2 == 0) arr[i] /= 2;
            else if (arr[i] < 50 && arr[i] % 2 == 1) arr[i] *= 2;
        }

        return arr;
    }
}

//class lv0.조건에맞게수열변형하기1 {
//    public int[] solution(int[] arr) {
//        return Arrays.stream(arr)
//                .map(operand -> operand >= 50 && operand % 2 == 0 ? operand / 2 : operand < 50 && operand % 2 == 1 ? operand * 2 : operand)
//                .toArray();
//    }
//}
