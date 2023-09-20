package lv0;

public class 캐릭터의좌표 {
    int[] answer = {0,0};
    public int[] solution(String[] keyinput, int[] board) {
        for ( String eachMove : keyinput) move(eachMove, board[0] / 2, board[1] / 2);
        return answer;
    }

    public void move(String eachMove, int maxWidth, int maxHeight) {
        if (eachMove.equals("up") && answer[1] < maxHeight) {
            answer[1]++;
            return;
        }
        if (eachMove.equals("down") && answer[1] > maxHeight * -1) {
            answer[1]--;
            return;
        }
        if (eachMove.equals("left") && answer[0] > maxWidth * -1) {
            answer[0]--;
            return;
        }
        if (eachMove.equals("right") && answer[0] < maxWidth) {
            answer[0]++;
            return;
        }
    }
}
