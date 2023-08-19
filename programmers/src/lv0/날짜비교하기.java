// 반복문을 통해 앞선 날짜를 비교할 수 있다.
// 전통적인 방식으로는 LocalDate를 이용해 isBefore 메서드로 비교 가능하다.
// 최신 문법을 통해 campare 메서드도 이용 가능하다. ( 1.9 버전 이상 사용 가능.)

package lv0;

import java.time.LocalDate;
import java.util.Arrays;

public class 날짜비교하기 {
    public int solution(int[] date1, int[] date2) {
        for (int i = 0; i < date1.length; i++) {
            if (date1[i] > date2[i]) break;
            else if (date1[i] < date2[i]) return 1;
        }
        return 0;
    }
}

//class 날짜비교하기 {
//    public int solution(int[] date1, int[] date2) {
//        LocalDate dateA = LocalDate.of(date1[0], date1[1], date1[2]);
//        LocalDate dateB = LocalDate.of(date2[0], date2[1], date2[2]);
//
//        if (dateA.isBefore(dateB)) return 1;
//        else return 0;
//    }
//}

//class 날짜비교하기 {
//    public int solution(int[] date1, int[] date2) {
//        return Arrays.compare(date1, date2) < 0 ? 1 : 0;
//    }
//}

