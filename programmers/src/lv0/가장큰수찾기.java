package lv0;

import java.util.Arrays;
import java.util.stream.IntStream;

public class 가장큰수찾기 {
    public int[] solution(int[] array) {
        int value = Arrays.stream(array).max().orElse(-1);
        int index = IntStream.range(0, array.length).filter(i -> array[i] == value).findFirst().orElse(-1);
        return new int[] {value, index};
    }
}
