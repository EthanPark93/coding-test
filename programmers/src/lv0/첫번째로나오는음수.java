package lv0;// 배열을 순회하면서 첫 번째로 0보다 작은 인덱스를 리턴하면 되는 간단한 문제.
// 스트림 문법도 가능하지만 음수인 인덱스를 모두 filter하고 그 중 첫 번째를 반환하기 때문에 연산이 늘어날 수 있다.
// 따라서 기본 for문을 사용해 음수인 경우 바로 리턴하면서 메서드를 종료하는 것이 효율적이며 가독성이 좋다.

import java.util.stream.IntStream;

public class 첫번째로나오는음수 {
    public int solution(int[] num_list) {
        return IntStream.range(0, num_list.length).filter(i -> num_list[i] < 0).findFirst().orElse(-1);
    }
}

//class lv0.첫번째로나오는음수 {
//    public int solution(int[] num_list) {
//        for (int i = 0;i < num_list.length;i++) if (num_list[i] < 0) return i;
//
//        return -1;
//    }
//}
