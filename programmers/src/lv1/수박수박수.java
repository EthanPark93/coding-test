package lv1;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class 수박수박수 {
    public String solution(int n) {
        return IntStream.rangeClosed(1, n).mapToObj(i -> i % 2 == 1 ? "수" : "박").collect(Collectors.joining());
    }
}
