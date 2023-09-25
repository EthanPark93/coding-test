package lv1;

import java.util.Arrays;

public class K번째수 {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];

        for (int i = 0; i < commands.length; i++) {
            int[] t = Arrays.copyOfRange(array ,commands[i][0]-1, commands[i][1]);
            Arrays.sort(t);
            answer[i] = t[commands[i][2]-1];
        }

        return answer;
    }
}
