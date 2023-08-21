package lv0;

public class 정사각형으로만들기 {
    public int[][] solution(int[][] arr) {
        int size = arr.length > arr[0].length ? arr.length : arr[0].length;
        int[][] answer = new int[size][size];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) answer[i][j] = arr[i][j];
        }
        return answer;
    }
}
