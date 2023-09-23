package lv1;

import java.util.Arrays;
import java.util.stream.IntStream;

public class 없는숫자더하기 {
    public int solution(int[] numbers) {
        int[] numberAr = new int[10];

        for (int n : numbers) numberAr[n]++;

        return IntStream.range(0, 10).filter(i -> numberAr[i] == 0).sum();
    }
}

//class 없는숫자더하기 {
//    public int solution(int[] numbers) {
//        return 45- Arrays.stream(numbers).sum();
//    }
//}
