package lv0;

import java.util.Arrays;

public class N번째원소부터 {
    public int[] solution(int[] num_list, int n) {
        return Arrays.copyOfRange(num_list, n-1, num_list.length);
    }
}
