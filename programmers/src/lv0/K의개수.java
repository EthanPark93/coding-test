// 스트림 문법을 사용하는 방법이 있고, 두 번째의 목표 문자를 공백으로 replace하여 문자열 길이를 비교하는 방법이 있다.

package lv0;

import java.util.stream.IntStream;

public class K의개수 {
    public int solution(int i, int j, int k) {
        return IntStream.rangeClosed(i, j)
                .mapToObj(Integer::toString)
                .map(s -> s.chars().filter(c -> c == k + '0').count())
                .mapToInt(Long::intValue)
                .sum();
    }
}

//class K의개수 {
//    public int solution(int i, int j, int k) {
//        String str = "";
//
//        for(int a = i; a <= j; a++) str += a+"";
//
//        return str.length() - str.replace(k+"", "").length();
//    }
//}
