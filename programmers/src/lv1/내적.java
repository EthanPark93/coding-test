package lv1;

import java.util.stream.*;

class 내적 {
    public int solution(int[] a, int[] b) {
        return IntStream.range(0, a.length).map(i -> a[i] * b[i]).sum();
    }
}
