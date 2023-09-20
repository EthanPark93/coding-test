package lv0;

import java.util.Arrays;
import java.util.stream.Collectors;

public class 모음제거 {
    public String solution(String my_string) {
        return Arrays.stream(my_string.split("")).filter(s -> !("aeiou").contains(s)).collect(Collectors.joining());
    }
}

//class 모음제거 {
//    public String solution(String my_string) {
//        return my_string.replaceAll("[aeiou]", "");
//    }
//}
