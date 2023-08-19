// reduce 연산을 통해 누적합을 구하는 방식으로 풀이할 수 있다.
// colletors 의 joining 메서드로 더 간단히 표현 가능하다.

package lv0;

import java.util.Arrays;
import java.util.stream.Collectors;

public class 꼬리문자열 {
    public String solution(String[] str_list, String ex) {
        return Arrays.stream(str_list).filter(s -> !s.contains(ex)).reduce((x, y) -> x + y).orElse("");
    }
}

//class 꼬리문자열 {
//    public String solution(String[] strList, String ex) {
//        return Arrays.stream(strList).filter(s -> !s.contains(ex)).collect(Collectors.joining());
//    }
//}
