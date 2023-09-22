package lv0;// StringBuilder를 활용하면 복잡한 for문 없이 빠르게 처리할 수 있는 문제입니다.
// 앞부분과, 뒤집을 부분, 뒷부분으로 나누고 뒤집을 부분을 reverse처리해서 붙여도 되지만,
// replace로 대체하는 방법을 사용해봤습니다.

class 문자열뒤집기2 {
    public String solution(String my_string, int s, int e) {
        StringBuffer sb = new StringBuffer(my_string); // 전체 문자열
        StringBuffer sub = new StringBuffer(my_string.substring(s,e+1)); // 부분 문자열
        sb.replace(s,e+1, sub.reverse().toString()); // 전체문자열에서 부분 문자열 대체

        return sb.toString();
    }
}
