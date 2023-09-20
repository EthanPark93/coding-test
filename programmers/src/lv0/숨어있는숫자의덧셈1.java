package lv0;

import java.util.Arrays;

public class 숨어있는숫자의덧셈1 {
    public int solution(String my_string) {
        return Arrays.stream(my_string.replaceAll("[a-z|A-Z]", "").split("")).mapToInt(Integer::parseInt).sum();
    }
}
