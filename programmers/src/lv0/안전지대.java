package lv0;

public class 안전지대 {
    public int solution(int[][] board) {
        int answer = 0;
        int[] dx = {1,1,0,-1,-1,-1,0,1};
        int[] dy = {0,1,1,1,0,-1,-1,-1};

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (board[i][j] == 1) {
                    for (int k = 0; k < 8; k++) {
                        int x = j+dx[k];
                        int y = i+dy[k];
                        if (x >= 0 && x < board.length && y >= 0 && y < board[0].length && board[y][x] != 1) {
                            board[y][x] = -1;
                        }
                    }
                }
            }
        }

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                if (board[i][j] == 0) answer++;
            }
        }


        return answer;
    }
}
