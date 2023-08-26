// 스트림의 distinct 메서드를 이용한 첫번째 방식과
// 중복을 허용하지 않는 set 자료구조의 특성을 이용한 두 번째 방식이 있다.
// 자료가 계속 추가되는 상황을 상성하면 두 번째 방식이 보다 효율적일 것이다.

package lv0;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class 중복된문자제거 {
    public String solution(String my_string) {
        return Arrays.stream(my_string.split("")).distinct().collect(Collectors.joining());
    }
}

//class 중복된문자제거 {
//    public String solution(String my_string) {
//        String[] answer = my_string.split("");
//        Set<String> set = new LinkedHashSet<String>(Arrays.asList(answer));
//
//        return String.join("", set);
//    }
//}
