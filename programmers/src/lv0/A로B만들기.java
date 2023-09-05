package lv0;

import java.util.Arrays;

public class A로B만들기 {
    public int solution(String before, String after) {
        String[] splited = before.split("");

        for (int i = 0; i < splited.length; i++) {
            if (!after.contains(splited[i])) return 0;
            after = after.replaceFirst(splited[i], "");
        }
        return 1;
    }
}

//class A로B만들기 {
//    public int solution(String before, String after) {
//        char[] a = before.toCharArray();
//        char[] b = after.toCharArray();
//        Arrays.sort(a);
//        Arrays.sort(b);
//
//        return new String(a).equals(new String(b)) ? 1 :0;
//    }
//}
