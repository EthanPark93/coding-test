package lv0;

import java.util.Arrays;

public class 배열의평균값 {
    public double solution(int[] numbers) {
        return Arrays.stream(numbers).average().orElse(0);
    }
}
