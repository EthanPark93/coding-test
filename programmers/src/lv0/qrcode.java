package lv0;// 풀이가 필요 없는 문제. 문제 요구사항대로 q로 나눈 나머지가 r인 곳의 인덱스에서 정답 문자열에 이어붙인다.

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class qrcode {
    public String solution(int q, int r, String code) {
        String answer = "";

        for (int i = 0; i < code.length(); i++) if (i % q == r) answer += code.charAt(i);

        return answer;
    }
}


// 자바 8 문법을 이용할 수 있지만, 오히려 가독성도 떨어지고 성능적으로 뛰어나지도 않다.

//public class lv0.qrcode {
//    public String solution(int q, int r, String code) {
//        return IntStream.range(0, code.length())
//                .filter(operand -> operand % q == r)
//                .mapToObj(i -> String.valueOf(code.charAt(i)))
//                .collect(Collectors.joining());
//    }
//}