package lv0;

import java.util.Arrays;

public class 짝수홀수갯수 {
    public int[] solution(int[] num_list) {
        int countEven = (int) Arrays.stream(num_list).filter(i -> i % 2 == 0).count();
        return new int[] {countEven, num_list.length - countEven};
    }
}

//class 짝수홀수갯수 {
//    public int[] solution(int[] num_list) {
//        int[] answer = new int[2];
//
//        for(int i = 0; i < num_list.length; i++) answer[num_list[i] % 2]++;
//
//        return answer;
//    }
//}
