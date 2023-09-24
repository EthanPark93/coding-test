package lv1;

import java.util.Arrays;

public class 자릿수더하기 {
    public int solution(int n) {
        return Arrays.stream(String.valueOf(n).split("")).mapToInt(Integer::valueOf).sum();
    }
}
