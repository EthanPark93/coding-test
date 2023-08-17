// 첫 번째 방식은 이중 for문을 사용해 값을 복사하는 방식이다.
// 두 번째 방식은 stream을 활용해 주어진 값을 평면화하고 복사하는 방식이다.

// 두 번째의 단점:
// 복잡한 코드: 함수형 스트림 API를 처음 사용하는 경우 이해하기 어려울 수 있으며, 람다 식 등을 사용하는 개념을 숙지해야 한다.
// 불필요한 객체 생성: 스트림 내에서 객체로 변환 및 처리를 해야하므로, 기본 타입의 성능 이점을 잃을 수 있다.

// 코드의 가독성, 유지 보수성, 성능 요구사항 등을 고려하여 적절한 방식을 선택하는 것이 중요하다.

package lv0;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class 배열의원소만큼추가하기 {
    public List<Integer> solution(int[] arr) {
        List<Integer> answerList = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i]; j++) {
                answerList.add(arr[i]);
            }
        }

        return answerList;
    }
}

//class 배열의원소만큼추가하기 {
//    public List<Integer> solution(int[] arr) {
//        return Arrays.stream(arr).boxed().flatMap(num -> Collections.nCopies(num, num).stream()).collect(Collectors.toList());
//    }
//}
