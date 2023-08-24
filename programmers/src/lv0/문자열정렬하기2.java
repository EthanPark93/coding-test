package lv0;

import java.util.Arrays;

public class 문자열정렬하기2 {
    public String solution(String my_string) {
        return Arrays.stream(my_string.toLowerCase().split("")).sorted().reduce("",(x,y) -> x + y);
    }
}
