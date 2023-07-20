// 문자열을 순회하면서 아스키코드 A의 값이 시작 인덱스 0이 되도록 마이너스 연산처리.
// 대문자 알파벳과 소문자 알파벳의 사이에는 특수문자열 6개가 존재하기때문에 Z 알파벳 값 이상일 경우 6을 추가로 빼준다.

public class 문자개수세기 {
    public int[] solution(String my_string) {
        int[] answer = new int[52];

        for (int i = 0; i < my_string.length(); i++) {
            if (my_string.charAt(i) > 'Z') answer[my_string.charAt(i) - 'A'- 6]++;
            else answer[my_string.charAt(i) - 'A']++;
        }

        return answer;
    }
}
