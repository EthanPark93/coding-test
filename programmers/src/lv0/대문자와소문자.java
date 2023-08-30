package lv0;

import java.util.stream.Collectors;

public class 대문자와소문자 {
    public String solution(String my_string) {
        return my_string.chars()
                .mapToObj(c -> c > 90 ? String.valueOf((char)(c - 32)) : String.valueOf((char)(c + 32)))
                .collect(Collectors.joining());
    }
}
