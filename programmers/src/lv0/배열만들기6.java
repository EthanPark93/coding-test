// 이 문제는 i 추가 시점, 그리고 조건을 변형하는 방법으로 코드를 훨신 절약할 수 있다.
// 스택이 비어있거나 끝값이 같은 경우에 끝 값을 제거하는 공통부분은 묶어서 처리한다.
// i는 단일 회차를 마치면 무조건 증가하기 때문에 인덱스는 순차적으로 증가한다. 따라서 foreach 루프를 사용할 수 있다.

package lv0;

import java.util.Stack;

public class 배열만들기6 {
    public int[] solution(int[] arr) {
        Stack<Integer> stack = new Stack<>();

        for (int no : arr) {
            if (!stack.isEmpty() && no == stack.peek()) stack.pop();
            else stack.push(no);
        }

        return stack.isEmpty() ? new int[] { -1 } : stack.stream().mapToInt(i -> i).toArray();
    }
}
