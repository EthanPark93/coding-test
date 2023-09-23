package lv1;

import java.util.Arrays;

public class 문자열내p와y의갯수 {
    boolean solution(String s) {
        long p = Arrays.stream(s.toLowerCase().split("")).filter(c -> c.equals("p")).count();
        long y = Arrays.stream(s.toLowerCase().split("")).filter(c -> c.equals("y")).count();
        return p == y;
    }
}
