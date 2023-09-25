package lv1;

import java.util.*;

public class 문자열내마음대로정렬하기 {
    public String[] solution(String[] strings, int n) {
        return Arrays.stream(strings).map(s -> s.charAt(n) + s).sorted().map(s -> s.substring(1)).toArray(String[]::new);
    }
}

//class 문자열내마음대로정렬하기 {
//    public String[] solution(String[] strings, int n) {
//        Arrays.sort(strings);
//        Arrays.sort(strings, Comparator.comparing((s) -> s.substring(n, n + 1)));
//        return strings;
//    }
//}