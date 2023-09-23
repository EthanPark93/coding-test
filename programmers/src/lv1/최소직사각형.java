package lv1;

public class 최소직사각형 {
    public int solution(int[][] sizes) {
        int row = 0;
        int col = 0;

        for (int one[] : sizes) {
            int max = Math.max(one[0], one[1]);
            int min = Math.min(one[0], one[1]);

            row = max > row ? max : row;
            col = min > col ? min : col;
        }

        return row * col;
    }
}
