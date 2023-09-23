package lv1;

import java.util.stream.IntStream;

public class 음양더하기 {
    public int solution(int[] absolutes, boolean[] signs) {
        return IntStream.range(0, signs.length).filter(i -> signs[i]).map(n -> absolutes[n]).sum()
                - IntStream.range(0, signs.length).filter(i -> !signs[i]).map(n -> absolutes[n]).sum();
    }
}

//class 음양더하기 {
//    public int solution(int[] absolutes, boolean[] signs) {
//        int answer = 0;
//        for (int i=0; i<signs.length; i++)answer += absolutes[i] * (signs[i]? 1: -1);
//        return answer;
//    }
//}
