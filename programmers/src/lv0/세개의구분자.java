package lv0;

import java.util.Arrays;

public class 세개의구분자 {
    public String[] solution(String myStr) {
        String[] result = Arrays.stream(myStr.split("[abc]"))
                .filter(s -> !s.isEmpty())
                .toArray(String[]::new);

        return result.length == 0 ? new String[]{"EMPTY"} :result;
    }
}
