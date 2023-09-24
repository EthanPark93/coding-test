package lv1;

import java.util.*;
import java.util.stream.Collectors;

public class 문자열내림차순으로정렬하기 {
    public String solution(String s) {
        return Arrays.stream(s.split("")).sorted(Comparator.reverseOrder()).collect(Collectors.joining());
    }
}
