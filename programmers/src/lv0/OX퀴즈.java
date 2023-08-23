package lv0;

public class OX퀴즈 {
    public String[] solution(String[] quiz) {
        String[] answer = new String[quiz.length];

        for (int i = 0; i < quiz.length; i++) {
            String[] t = quiz[i].split(" ");

            if (t[1].equals("+")) answer[i] = Integer.parseInt(t[0]) + Integer.parseInt(t[2]) == Integer.parseInt(t[4]) ? "O" : "X";
            else answer[i] = Integer.parseInt(t[0]) - Integer.parseInt(t[2]) == Integer.parseInt(t[4]) ? "O" : "X";
        }

        return answer;
    }
}
