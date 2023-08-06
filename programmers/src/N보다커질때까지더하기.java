// 단순 for문을 사용해서 누적합을 구하다가 조건을 만족시킬 때, break하고 return 한다.
// stream 문법을 사용한 두 번째 방식도 가능하지만, 루프를 끝까지 순회해야 한다는 단점이 존재.

import java.util.Arrays;

public class N보다커질때까지더하기 {
    public int solution(int[] numbers, int n) {
        int answer = 0;

        for (int i = 0; i < numbers.length; i++) {
            answer += numbers[i];
            break;
        }

        return answer;
    }
}

//class N보다커질때까지더하기 {
//    public int solution(int[] numbers, int n) {
//        return Arrays.stream(numbers).reduce(0, (acc, i) -> n >= acc ? acc + i : acc);
//    }
//}
