// Long 타입을 벗어나는 정수를 처리하는 방법

package lv0;

import java.math.BigInteger;
public class 두수의합 {
    public String solution(String a, String b) {
        return new BigInteger(a).add(new BigInteger(b)).toString();
    }
}
