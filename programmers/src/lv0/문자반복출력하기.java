package lv0;

public class 문자반복출력하기 {
    public String solution(String my_string, int n) {
        String answer = "";
        for (int i = 0; i < my_string.length(); i++) answer += my_string.substring(i, i+1).repeat(n);
        return answer;
    }
}
