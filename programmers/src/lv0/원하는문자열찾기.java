// indexOf 메서드를 사용할 수도 있지만, contains로 보다 간결히 표현 가능하다.
// 대소문자를 구분하지 않기 때문에, 두 문자열 모두 소문자로 변환하여 삼항연산자를 통해 return한다.

package lv0;

public class 원하는문자열찾기 {
    public int solution(String myString, String pat) {
        return myString.toLowerCase().contains(pat.toLowerCase()) ? 1 : 0;
    }
}
