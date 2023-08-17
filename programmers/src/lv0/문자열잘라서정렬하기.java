// x가 연속으로 등장할 때, 빈 문자열이 추가되는 것을 주의해야 한다.

package lv0;

import java.util.Arrays;

public class 문자열잘라서정렬하기 {
    public String[] solution(String myString) {
        return Arrays.stream(myString.split("x")).filter(s -> !s.equals("")).sorted().toArray(String[]::new);
    }
}
