package lv1;

import java.util.Arrays;

public class 제일작은수제거하기 {
    public int[] solution(int[] arr) {
        if (arr.length == 1) return new int[] {-1};
        else return Arrays.stream(arr).filter(i -> i != Arrays.stream(arr).min().orElse(-2)).toArray();
    }
}
