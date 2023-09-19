package lv0;

import java.util.Arrays;

public class 배열원소의길이 {
    public int[] solution(String[] strlist) {
        return Arrays.stream(strlist).mapToInt(String::length).toArray();
    }
}
