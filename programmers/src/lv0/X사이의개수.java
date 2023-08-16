// split 메서드에 두번째 인자로 -1을 넣는 이유는 빈문자열도 포함해서 처리하기 위함이다.

package lv0;

import java.util.Arrays;

public class X사이의개수 {
    public int[] solution(String myString) {
        return Arrays.stream(myString.split("x", -1)).mapToInt(i -> i.length()).toArray();
    }
}
