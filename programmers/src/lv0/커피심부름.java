package lv0;

public class 커피심부름 {
    public int solution(String[] order) {
        int answer = 0;
        for (String s : order) {
            if (s.contains("cafelatte")) answer += 5000;
            else answer += 4500;
        }
        return answer;
    }
}
