// charArray를 사용한 방식과, list와 collections를 통한 함수형 코딩 방식이 있다.

package lv0;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class 인덱스바꾸기 {
    public String solution(String my_string, int num1, int num2) {
        char[] charArray = my_string.toCharArray();

        char temp = charArray[num1];
        charArray[num1] = charArray[num2];
        charArray[num2] = temp;

        return new String(charArray);
    }
}

//class 인덱스바꾸기 {
//    public String solution(String myString, int num1, int num2) {
//        List<String> list = Arrays.stream(myString.split("")).collect(Collectors.toList());
//
//        Collections.swap(list, num1, num2);
//        return String.join("", list);
//    }
//}
