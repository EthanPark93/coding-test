// 매 구간을 substring으로 잘라내고 조건문자열로 시작하는지 확인하여 stream을 1로 맵핑하고 모두 더한다.

package lv0;

import java.util.stream.IntStream;

public class 문자열이몇번등장하는지세기 {
    public int solution(String myString, String pat) {
        return IntStream.range(0,myString.length()).map(i -> myString.substring(i).startsWith(pat) ? 1 : 0).sum();
    }
}
