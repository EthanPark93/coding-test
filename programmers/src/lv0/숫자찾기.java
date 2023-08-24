// 인덱스 자리와, 문제 조건에서 말하는 문자 자리가 다르기 때문에 숫자가 아닌 문자 하나를 추가해서 인덱스를 자리값으로 바꾼다.

package lv0;

public class 숫자찾기 {
    public int solution(int num, int k) {
        return ("-" + num).indexOf("" + k);
    }
}
