package lv1;

public class N2016년 {
    public String solution(int a, int b) {
        int[] days = {0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30};
        String[] week = {"THU", "FRI", "SAT", "SUN", "MON", "TUE", "WED"};

        for (int i = 0; i < a; i++) b += days[i];

        return week[b % 7];
    }
}
