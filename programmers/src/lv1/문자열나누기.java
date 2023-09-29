package lv1;

public class 문자열나누기 {
    public int solution(String s) {
        int answer = 0;
        int[] same = new int[] {0, 0};
        String[] splitAt = s.split("");
        String x = splitAt[0];

        for (int i = 0; i < splitAt.length; i++) {
            if (x.equals("")) x = splitAt[i];

            if (splitAt[i].equals(x)) same[0]++;
            else same[1]++;

            if (same[0] == same[1]) {
                answer++;
                x = "";
                same[0] = 0;
                same[1] = 0;
            }
        }

        answer += same[0] == same[1] ? 1 : 0;

        return answer;
    }
}
