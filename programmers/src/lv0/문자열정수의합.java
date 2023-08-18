// chars를 사용해 문자의 아스키코드 값으로 스트림이 만들어진다.
// 이를 -연산을 통해 intStream으로 만든 후 합산한다.

package lv0;

public class 문자열정수의합 {
    public int solution(String num_str) {
        return num_str.chars().map(c -> c - 48).sum();
    }
}
