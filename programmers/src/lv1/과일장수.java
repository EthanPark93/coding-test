package lv1;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class 과일장수 {
    public int solution(int k, int m, int[] score) {
        int answer = 0;

        score = Arrays.stream(score).boxed().sorted(Comparator.reverseOrder()).mapToInt(Integer::intValue).toArray();

        System.out.println(score[0]);

        return answer;
    }
}
