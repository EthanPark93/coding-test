package lv0;

public class 다항식더하기 {
    public String solution(String polynomial) {
        int x = 0; int n = 0;
        String answer = "";

        for (String s : polynomial.split(" ")) {
            if (s.contains("x"))  x += s.equals("x") ? 1 : Integer.parseInt(s.replace("x", ""));
            else if (!s.equals("+")) n += Integer.parseInt(s);
        }

        if (x == 1) answer = n == 0 ? "x" : "x + " + n;
        else if (x > 1) answer = n == 0 ? x+"x" : x+"x + " + n;
        else answer = "" + n;

        return answer;
    }
}
