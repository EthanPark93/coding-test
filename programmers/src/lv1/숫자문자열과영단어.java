package lv1;

public class 숫자문자열과영단어 {
    public int solution(String s) {
        String[] numAr = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};

        for (int i = 0; i < 10; i++) s = s.replace(numAr[i], (""+i));

        return Integer.parseInt(s);
    }
}
