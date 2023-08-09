package lv0;// query를 순회하며, 짝수인지 판단하고 copyOfRange 메서드로 배열을 복사하되 구간을 조건에 맞게 설정한다.

import static java.util.Arrays.*;

public class 배열조각하기 {
    public int[] solution(int[] arr, int[] query) {
        for (int i = 0; i < query.length; i++) {
            arr = i % 2 == 0 ? copyOfRange(arr, 0, query[i]+1) : copyOfRange(arr, query[i], arr.length);
        }
        return arr;
    }
}
