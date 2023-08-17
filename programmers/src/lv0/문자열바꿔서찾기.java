// 스트림 배열로 바꾸어서 처리하고, 이를 reduce 연산 혹은, collect의 joining으로 합치는 방법이 있다.
// 다음으로 값 교환 방식으로 배열을 처리하고 조건문자열 포함여부를 판단하는 방법이 있다.

// 첫 번째 방식 (스트림과 reduce 사용):
//        장점:
//        함수형 프로그래밍 스타일로 작성되어 가독성이 좋고, 코드의 의도가 명확하게 드러납니다.
//        중간에 변환된 문자열 배열을 다룰 수 있는 유연성이 있습니다.
//        중간 변환된 배열을 reduce나 collect의 joining 등으로 합칠 수 있어 원하는 형태로 가공이 용이합니다.
//
//        단점:
//        중간에 배열을 생성하고 다시 합치는 과정이 필요하여 메모리 사용량과 연산 비용이 늘어날 수 있습니다.
//        문자열 길이가 길다면 문자열을 합치는 과정에서 성능 저하가 발생할 수 있습니다.

// 두 번째 방식 (값 교환 방식):
//        장점:
//        문자열을 한 번에 처리하므로 메모리 사용량과 중간 배열 생성 없이 직접 변환하여 비교할 수 있습니다.
//        문자열 길이가 길든 짧든 거의 일정한 성능을 유지할 수 있습니다.
//
//        단점:
//        연속적인 값 교환이 필요한 경우, 복잡한 문자열 변환이 이루어질 수 있습니다.
//        코드가 한 줄로 간결하지만, 변환 과정이 복잡하여 가독성이 떨어질 수 있습니다.

//        각 방식의 선택은 상황과 성능 요구사항에 따라 결정되어야 합니다.
//        만약 문자열이 길거나 성능이 중요한 경우에는 두 번째 방식이 좋을 수 있으며, 함수형 스타일과 가독성이 중요한 경우에는 첫 번째 방식을 선택할 수 있습니다.

package lv0;

import java.util.Arrays;

public class 문자열바꿔서찾기 {
    public int solution(String myString, String pat) {
        return Arrays.stream(myString.split(""))
                .map(i -> i.equals("A") ? "B" : "A")
                .reduce("", (acc, s) -> acc + s)
                .contains(pat) ? 1 : 0;
    }
}

//class 문자열바꿔서찾기 {
//    public int solution(String myString, String pat) {
//        return myString.replace("A", "a").replace("B", "A").replace("a", "B").contains(pat) ? 1 : 0;
//    }
//}
