// x와 y에 대한 변화량 dx, dy를 미리 작성해두고 이를 조건에 맞게 4로 나눈 나머지를 활용하여 방향전환한다.
// 2차 행렬 범위를 벗어나거나 값이 0 이상인 경우를 방향 전환 조건으로 설정하는것이 핵심.
// 다음 방향은 현재 좌표에 nx, ny를 더한 값이 된다.

package lv0;

public class 정수를나선형으로배치하기 {
    public int[][] solution(int n) {
        int[][] answer = new int[n][n];
        int num = 1;
        int x = 0, y = 0;
        int dx[] = {0, 1, 0, -1};
        int dy[] = {1, 0, -1, 0};
        int direction = 0;

        while (num <= n * n) {
            answer[x][y] = num++;

            int nx = x + dx[direction];
            int ny = y + dy[direction];

            if (nx < 0 || nx >= n || ny < 0 || ny >= n || answer[nx][ny] != 0) {
                direction = (direction + 1) % 4;
                nx = x + dx[direction];
                ny = y + dy[direction];
            }
            x = nx;
            y = ny;
        }

        return answer;
    }
}
