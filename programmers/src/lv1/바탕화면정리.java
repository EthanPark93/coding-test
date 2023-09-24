package lv1;

public class 바탕화면정리 {
    public int[] solution(String[] wallpaper) {
        int[] answer = {50,50,0,0};

        for (int i = 0; i < wallpaper.length; i++) {
            for (int j = 0; j < wallpaper[0].length(); j++) {
                if (wallpaper[i].charAt(j) == '#') {
                    answer[0] = i < answer[0] ? i : answer[0];
                    answer[1] = j < answer[1] ? j : answer[1];
                    answer[2] = i > answer[2] ? i : answer[2];
                    answer[3] = j > answer[3] ? j : answer[3];
                }
            }
        }

        answer[2]++;
        answer[3]++;

        return answer;
    }
}
