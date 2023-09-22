package lv0;

import java.util.Arrays;
import java.util.stream.Collectors;

public class 외계행성의나이 {
    public String solution(int age) {
        return Arrays.stream(("" + age).split("")).map(i -> "" + (char) (Integer.parseInt(i) + 97)).collect(Collectors.joining());
    }
}
