package lv1;

public class 로또의최저순위와최고순위 {
    public int[] solution(int[] lottos, int[] win_nums) {
        int hit = 0;
        int zero = 0;

        for (int i = 0; i < 6; i++) {
            if (lottos[i] != 0) for (int j = 0; j < 6; j++) if (lottos[i] == win_nums[j]) hit++;
            else zero++;
        }

        return new int[] {Math.min(6, 7-(zero+hit)), Math.min(6, 7-hit)};
    }
}
