// 스트림을 사용하는 방법과 정규식을 사용화는 방법으로 풀이할 수 있다.

package lv0;

import java.util.stream.Collectors;

public class L로만들기 {
    public String solution(String myString) {
        return myString.chars()
                .mapToObj(i -> Character.toString(Integer.max(i, 'l')))
                .collect(Collectors.joining());
    }
}

//class L로만들기 {
//    public String solution(String myString) {
//        return myString.replaceAll("[^l-z]", "l");
//    }
//}
