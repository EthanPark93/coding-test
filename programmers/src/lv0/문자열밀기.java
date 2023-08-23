// 역시나 아이디어의 승리인 문제.
// A+A와 B+B에서 indexOf하는 차이의 규칙을 캐치하는 것이 중요하다.
// 문제 조건을 그대로 쉐도잉하면서 코딩하는 것과 핵심 규칙을 찾아서 해결하는 것이 차이는 중요하다.

package lv0;

public class 문자열밀기 {
    public int solution(String A, String B) {
        int answer = 0;

        for (int i = 0; i < A.length(); i++) {
            if (A.equals(B)) return answer;

            A = A.substring(A.length() - 1) + A.substring(0, A.length() - 1);
            answer++;
        }

        return -1;
    }
}

//class 문자열밀기 {
//    public int solution(String A, String B) {
//        return (B+B).indexOf(A);
//    }
//}
