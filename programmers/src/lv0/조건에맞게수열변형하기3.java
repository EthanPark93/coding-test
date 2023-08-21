package lv0;

import java.util.Arrays;

public class 조건에맞게수열변형하기3 {
    public int[] solution(int[] arr, int k) {
        return Arrays.stream(arr).map(i -> k % 2 == 0 ? i + k : i * k).toArray();
    }
}
