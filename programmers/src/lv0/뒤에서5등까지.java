package lv0;

import java.util.Arrays;

public class 뒤에서5등까지 {
    public int[] solution(int[] num_list) {
        return Arrays.stream(num_list).sorted().limit(5).toArray();
    }
}
