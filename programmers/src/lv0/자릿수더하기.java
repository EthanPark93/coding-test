// stream 객체를 활용한 방식과, 나머지와 몫을 각각 정답 변수와 주어진 매개변수에 가감하는 방식으로 풀이하는 방식이 있다.
// 메모리 할당과 해제없이 단순 반복문과 사칙연산으로 처리하는 두 번째 방식이 더 좋아보인다.

package lv0;

import java.util.Arrays;

public class 자릿수더하기 {
    public int solution(int n) {
        return Arrays.stream(("" + n).split("")).mapToInt(Integer::parseInt).sum();
    }
}

//class 자릿수더하기 {
//    public int solution(int n) {
//        int answer = 0;
//
//        while(n>0){
//            answer+=n%10;
//            n/=10;
//        }
//
//        return answer;
//    }
//}
