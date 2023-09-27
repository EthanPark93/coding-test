package lv1;

import java.util.Arrays;

public class N1차다트게임 {
    public int solution(String dartResult) {
        int[] score = new int[3];
        int scoreIdx = -1;

        for (int i = 0; i < dartResult.length(); i++) {
            String s = dartResult.substring(i, i + 1);

            if (s.matches("[0-9]")) {
                if (dartResult.substring(i + 1, i + 2).matches("[0-9]")) {
                    score[++scoreIdx] = 10;
                    i++;
                } else {
                    score[++scoreIdx] = Integer.parseInt(s);
                }
            } else {
                switch (s) {
                    case "D":
                        score[scoreIdx] *= score[scoreIdx];
                        break;
                    case "T":
                        score[scoreIdx] *= score[scoreIdx] * score[scoreIdx];
                        break;
                    case "*":
                        score[scoreIdx] *= 2;
                        if (scoreIdx > 0) score[scoreIdx - 1] *= 2;
                        break;
                    case "#":
                        score[scoreIdx] *= -1;
                        break;
                }
            }
        }

        return Arrays.stream(score).sum();
    }
}
