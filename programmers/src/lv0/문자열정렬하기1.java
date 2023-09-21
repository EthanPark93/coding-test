package lv0;

import java.util.Arrays;

public class 문자열정렬하기1 {
    public int[] solution(String my_string) {
        return Arrays.stream(my_string.replaceAll("[a-z]", "").split("")).sorted().mapToInt(Integer::parseInt).toArray();
    }
}
