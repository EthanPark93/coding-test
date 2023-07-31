// 첫 번째 풀이 방법은 해당 인덱스 값을 찾아 스트링에 대입하여 판별하는 방식이다.
// 두 번째는 스트링 배열을 순회하며 조건을 판별하며, 조건을 만족하는 값이 존재하지 않으면 빈 배열을 반환한다.

import java.util.Arrays;
import java.util.stream.IntStream;

public class 왼쪽오른쪽 {
    public String[] solution(String[] str_list) {

        int findIndex = IntStream.range(0, str_list.length).filter(i -> str_list[i].equals("l") || str_list[i].equals("r")).findFirst().orElse(-1);

        if (findIndex == -1) return new String[] {};
        else if (str_list[findIndex].equals("l")) return Arrays.copyOfRange(str_list, 0, findIndex);
        else return Arrays.copyOfRange(str_list, findIndex+1, str_list.length);
    }
}

//class 왼쪽오른쪽 {
//    public String[] solution(String[] str_list) {
//
//        for (int i = 0; i < str_list.length; i++) {
//
//            if ("l".equals(str_list[i])) {
//                return Arrays.copyOfRange(str_list, 0, i);
//            } else if ("r".equals(str_list[i])) {
//                return Arrays.copyOfRange(str_list, i + 1, str_list.length);
//            }
//        }
//
//        return new String[0];
//    }
//}
