package lv0;// 크게 두 가지 방법으로 생각할 수 있다.
// 첫 번째 방법은 자바8 stream을 이용한 방법으로, 메서드를 통해 순회하면서 조건에 따라 filter해준다.
// 두 번째 방법은 별다른 메서들르 이용하지 않지만, 주어진 조건을 활용해 보다 성능적으로 최적화된다고 생각한다.

// 자바 int 타입의 성질을 이용하여 특정 배수가 몇개 존재할지 확인하여 배열 크기를 딱 맞게 생성한다.
// 이후, 그 갯수만큼 반복문을 통해 배수의 갯수를 배열에 추가한다.

// 이 문제에서 배울 점은, 고급 문법이나 짧은 코드가 무조건 좋은 것이 아니라는 것이다.
// 보다 단순하고 이해하기 쉬운 코드, 그리고 성능적으로도 최적화되는 코드가 좋다는 것을 배웠다.

import java.util.stream.IntStream;

public class 배열만들기1 {
    public int[] solution(int n, int k) {
        return IntStream.rangeClosed(1, n).filter(i -> i % k == 0).toArray();
    }
}

//public class lv0.배열만들기1 {
//    public int[] solution(int n, int k) {
//        int count = n / k;
//
//        int[] answer = new int[count];
//
//        for (int i = 1; i <= count; i++) answer[i - 1] = k * i;
//
//        return answer;
//    }
//}
