package lv0;

import java.util.Arrays;

public class 주사위의개수 {
    public int solution(int[] box, int n) {
        return Arrays.stream(box).map(i -> i / n).reduce(1, (x, y) -> x * y);
    }
}
