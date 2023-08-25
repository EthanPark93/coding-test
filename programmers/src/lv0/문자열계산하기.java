// 단순 반복문을 통해 해결하는 방법과 부호문자와 숫자문자를 결합하여 stream의 sum 메서드로 한번에 처리하는 방법이 있다.
// 두 번째 방법을 사용하려면 정규표현식에서 +의 의미가 달라질 수 있기때문에 대괄호로 감싸야한다

package lv0;

import java.util.Arrays;

public class 문자열계산하기 {
    public int solution(String my_string) {
        String[] splited = my_string.split(" ");
        int answer = Integer.parseInt(splited[0]);

        for (int i = 1; i < splited.length - 1; i++) {
            if (splited[i].equals("+")) answer += Integer.parseInt(splited[i + 1]);
            if (splited[i].equals("-")) answer -= Integer.parseInt(splited[i + 1]);
        }

        return answer;
    }
}

//class 문자열계산하기 {
//    public int solution(String myString) {
//        return Arrays.stream(myString.replaceAll("- ", "-").replaceAll("[+] ", "").split(" ")).mapToInt(Integer::parseInt).sum();
//    }
//}
