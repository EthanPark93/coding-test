package lv1;

public class 시저암호 {
    public String solution(String s, int n) {
        String answer = "";
        int[] charAr = s.chars().toArray();

        for (int i = 0; i < s.length(); i++) {
            int t = charAr[i];

            if (t == ' ') answer += " ";
            else {
                if (t > 'Z') t += t + n > 'z' ? n - 26 : n;
                else t += t + n > 'Z' ? n - 26 : n;

                answer += (char) t;
            }
        }

        return answer;
    }
}
