// 두가지 풀이를 생각해볼 수 있다.

// 첫 번째 풀이는 c번째 문자를 결과값에 더한 뒤, m번째 이후 문자열을 기존 문자열에 재할당 한다.
// 두 번째 풀이는 인덱스의 증가량을 += m으로 조정하여 c번째 문자열을 추가한다.

// 메서드를 두배로 사용하며, 변수에 새로운 참조값을 연속적으로 재할당해야 하는 첫 번째 방식보다 두 번째 방식이 간결하다.

class 세로읽기 {
    public String solution(String my_string, int m, int c) {
        String answer = "";

        while (my_string.length() > 0) {
            answer += my_string.charAt(c-1);
            my_string = my_string.substring(m);
        }

        return answer;
    }
}

//class 세로읽기 {
//
//    public String solution(String my_string, int m, int c) {
//        String answer = "";
//
//        for (int i = c - 1; i < my_string.length(); i += m) {
//            answer += my_string.charAt(i);
//        }
//        return answer;
//    }
//}
