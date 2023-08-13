// mapToObj 를 이용하여 IntStream을 string 타입의 배열로 변환하는 방법만 앓면 어려울 부분이 없는 문제이다.

package lv0;

import java.util.stream.IntStream;

public class 배열에서문자열대소문자변환하기 {
    public String[] solution(String[] strArr) {
        return IntStream.range(0, strArr.length)
                .mapToObj(i -> i % 2 == 1 ? strArr[i].toUpperCase() : strArr[i].toLowerCase())
                .toArray(String[]::new);
    }
}
