package lv0;

import java.util.Arrays;

public class N369게임 {
    public int solution(int order) {
        return (int) Arrays.stream(("" + order).split("")).filter(s -> s.equals("3") || s.equals("6") || s.equals("9")).count();
    }
}
