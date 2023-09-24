package lv1;

import java.util.*;
import java.util.stream.Collectors;

public class 정수내림차순으로배치하기 {
    public long solution(long n) {
        return Long.parseLong(Arrays.stream(("" + n).split("")).sorted(Comparator.reverseOrder()).collect(Collectors.joining()));
    }
}
