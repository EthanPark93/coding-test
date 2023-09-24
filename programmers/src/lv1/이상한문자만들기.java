package lv1;

import java.util.Arrays;
import java.util.stream.Collectors;

public class 이상한문자만들기 {
    public String solution(String s) {
        String[] split = s.toLowerCase().split("");
        int flag = 0;
        for (int i = 0; i < split.length; i ++) {
            if (split[i].equals(" ")) flag = i + 1;
            else if ((i - flag) % 2 == 0) split[i] = split[i].toUpperCase();
        }

        return Arrays.stream(split).collect(Collectors.joining());
    }
}
