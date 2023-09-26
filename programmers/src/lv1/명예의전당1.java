package lv1;

import java.util.*;

public class 명예의전당1 {
    public int[] solution(int k, int[] score) {
        int[] answer = new int[score.length];
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < score.length; i++) {
            list.add(score[i]);
            Collections.sort(list);

            if (list.size() > k) list.remove(0);

            answer[i] = list.get(0);
        }

        return answer;
    }
}
