// 스트림을 이용하는 방법과 정규식을 이용한 방법이 있다.

package lv0;

import java.util.Arrays;

public class 공백으로구분하기2 {
    public String[] solution(String my_string) {
        return Arrays.stream(my_string.split(" ")).filter(i -> !i.equals("")).toArray(String[]::new);
    }
}

//class 공백으로구분하기2 {
//    public String[] solution(String my_string) {
//        return my_string.trim().split("[ ]+");
//    }
//}