package lv0;

public class 직사각형넓이구하기 {
    public int solution(int[][] dots) {
        int row = 0;
        int col = 0;

        for (int i = 1; i < 4; i++) {
            if (dots[0][0] == dots[i][0]) col = dots[0][1] - dots[i][1];
            else row = dots[0][0] - dots[i][0];
        }

        return Math.abs(row * col);
    }
}
