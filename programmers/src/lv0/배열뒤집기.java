package lv0;

import java.util.*;
import java.util.stream.Collectors;

public class 배열뒤집기 {
    public int[] solution(int[] num_list) {
        int[] answer = new int[num_list.length];

        for (int i = 0; i < num_list.length; i++) {
            answer[i] = num_list[num_list.length-1 -i];
        }

        return answer;
    }
}

//class 배열뒤집기 {
//    public int[] solution(int[] numList) {
//        List<Integer> list = Arrays.stream(numList).boxed().collect(Collectors.toList());
//
//        Collections.reverse(list);
//        return list.stream().mapToInt(Integer::intValue).toArray();
//    }
//}