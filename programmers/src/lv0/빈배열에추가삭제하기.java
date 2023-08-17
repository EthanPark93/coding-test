// 리스트를 활용한 for 루프를 활용한 방식과, 스트링을 활용해 문자열로 만든 후 배열로 변환하는 방법이 있다.
// 다만 올바른 자료구조를 선택하여 성능을 개선할 수 있다. 일반적인 ArrayList 자료구조를 사용하면 빈번하게
// 끝 값에서 삭제가 이루어질 경우 연산에 비효율성이 생긴다.
// 스택 구조를 선택하면 LIFO구조이므로 삭제와 추가에 효율적이다. 시간복잡도가 선형이 아닌 상수에 가까워진다.

package lv0;

import java.util.Stack;
import java.util.stream.Stream;

public class 빈배열에추가삭제하기 {
    public int[] solution(int[] arr, boolean[] flag) {
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < flag.length; i++) {
            if (flag[i]) for (int j = 0; j < arr[i] * 2; j++) stack.push(arr[i]);
            else for (int j = 0; j < arr[i]; j++) stack.pop();
        }

        return stack.stream().mapToInt(Integer::intValue).toArray();
    }
}

//class 빈배열에추가삭제하기 {
//    public int[] solution(int[] arr, boolean[] flag) {
//        String answer = "";
//
//        for(int i = 0; i < arr.length; i++) {
//            if(flag[i]) answer += String.valueOf(arr[i]).repeat(arr[i]*2);
//            else answer = answer.substring(0, answer.length() - arr[i]);
//        }
//
//        return Stream.of(answer.split("")).mapToInt(Integer::parseInt).toArray();
//    }
//}
