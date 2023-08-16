package lv0;

import java.util.Arrays;

public class AD제거하기 {
    public String[] solution(String[] strArr) {
        return Arrays.stream(strArr).filter(i -> !i.contains("ad")).toArray(String[]::new);
    }
}
