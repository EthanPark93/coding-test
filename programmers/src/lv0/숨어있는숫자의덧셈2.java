package lv0;

import java.util.Arrays;

public class 숨어있는숫자의덧셈2 {
    public int solution(String my_string) {
        int answer = 0;
        String t = "";
        int[] charAr = my_string.chars().toArray();
        for (int i = 0; i < charAr.length; i++) {
            if (charAr[i] < 65) t += (char) charAr[i];

            else if (t.length() != 0) {
                answer += Integer.parseInt(t);
                t = "";
            }
        }
        return answer;
    }
}

//class 숨어있는숫자의덧셈2 {
//    public int solution(String my_string) {
//        return Arrays.stream(my_string.split("[A-Z|a-z]")).filter(s -> !s.isEmpty()).mapToInt(Integer::parseInt).sum();
//    }
//}
