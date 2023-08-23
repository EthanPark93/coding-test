// 일반적인 이중 루프와 set을 사용한 방식이 있다.
// set으로 코드 길이를 줄일 수는 있으나, 가독성이 떨어지며 불필요한 자료구조 메모리 할당이 요구된다.

package lv0;

import java.util.*;

public class 배열의유사도 {
    public int solution(String[] s1, String[] s2) {
        int answer = 0;

        for (int i = 0; i < s1.length; i++) {
            for (int j = 0; j < s2.length; j++) {
                if (s1[i].equals(s2[j])) answer++;
            }
        }

        return answer;
    }
}

//class 배열의유사도 {
//    public int solution(String[] s1, String[] s2) {
//        Set<String> set = new HashSet<>(Arrays.asList(s1));
//        return (int)Arrays.stream(s2).filter(set::contains).count();
//    }
//}
