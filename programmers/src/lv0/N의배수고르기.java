package lv0;

import java.util.Arrays;

public class N의배수고르기 {
    public int[] solution(int n, int[] numlist) {
        return Arrays.stream(numlist).filter(i -> i % n == 0).toArray();
    }
}
