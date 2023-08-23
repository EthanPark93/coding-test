package lv0;

import java.util.Arrays;

public class N7의개수 {
    public int solution(int[] array) {
        return (int) Arrays.stream(array)
                .mapToObj(String::valueOf)
                .reduce("", (x, y) -> x + y)
                .chars().filter(c -> c == 55).count();
    }
}
