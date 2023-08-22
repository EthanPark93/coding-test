// 문자열과 문자 등을 이용한 문제 풀이에서 stream을 사용하려면 mapToObj를 사용하는 것이 좋다.

package lv0;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class 암호해독 {
    public String solution(String cipher, int code) {
        return IntStream.range(0, cipher.length())
                .filter(i -> (i+1) % code == 0)
                .mapToObj(c -> String.valueOf(cipher.charAt(c)))
                .collect(Collectors.joining());
    }
}
