package lv0;// 이 문제도 어차피 문자열 배열을 문자열로 합치는 과정을 포함할 것이라면
// 0으로 변환 후 필터링 할 필요없이 빈 문자열로 변환 후 합치는 것이 더 간결하다.


import java.util.Arrays;

public class 글자지우기 {
    public String solution(String my_string, int[] indices) {
        String[] str = my_string.split("");

        for (int i=0;i<indices.length;i++) str[indices[i]] = "";

        return String.join("",str);
    }
}

//public class lv0.글자지우기 {
//    public String solution(String my_string, int[] indices) {
//        String[] splitAr = my_string.split("");
//
//        for (int i = 0; i < indices.length; i++) splitAr[indices[i]] = "0";
//
//        return String.join("", Arrays.stream(splitAr)
//                .filter(ch -> !ch.equals("0"))
//                .toArray(String[]::new));
//    }
//}
