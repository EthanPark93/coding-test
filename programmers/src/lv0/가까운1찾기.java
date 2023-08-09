package lv0;// 조건이 간단한 문제지만, 풀이의 효율성을 생각하면 핵심 아이디어가 있다.
// 조건 중에 idx 이상이어야 한다는 것을 생각하면, 루프를 처음부터 돌리면서 if문에 조건 두가지를 넣는 것이 아니라
// 애초에 idx번째부터 루프를 돌리면 된다.

// stream 문법 연습을 위해 이 방법도 첨부하지만 성능을 생각하면 기본 for문을 사용하는 것이 조금 더 유리하다고 생각한다.
// 가독성 측면에서도 그렇고, 루프를 idx부터 끝까지 돌려서 filter를 한 stream객체에서 첫번째를 굳이 찾아 반환하는 수고보다,
// 기본 for문에서 주어진 배열값을 순회하다가 조건에 맞을 때, 바로 루프를 종료시키는 것이 유리하다고 생각한다. ( 배열 길이가 아주 아주 아주 길다고 가정해보자.)

import java.util.stream.IntStream;

class 가까운1찾기 {
    public int solution(int[] arr, int idx) {
        return IntStream.range(idx, arr.length).filter(i -> arr[i] == 1).findFirst().orElse(-1);
    }
}

//public class lv0.가까운1찾기 {
//    public int solution(int[] arr, int idx) {
//        for (int i = idx; i < arr.length; i++) if (arr[i] == 1) return i;
//        return -1;
//    }
//}
