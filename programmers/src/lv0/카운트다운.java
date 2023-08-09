package lv0;// 기본 for문으로 간단하게 풀이할 수 있는 문제.
// 배열을 들어갈 숫자만큼의 크기로 생성하고 그 크기만큼 순회한다.
// 배열의 인덱스에 해당하는 위치에 시작 숫자 - 인덱스를 해주면 감소하는 수를 담을 수 있다.

// stream 문법을 활용하면 조금 더 간결하게 적을 수 있다.
// 이 풀이를 사용하려면 start와 end에 모두 음수 처리를 해주어 배열에 넣고 싶은 순서대로 표현할수 있다.
// 대신 map할 때 음수처리를 복구해야한다.
// 음수처리를 하지않고 배열에 넣는 경우 역순 정렬을 위해 코드가 지저분해진다.

import java.util.Comparator;
import java.util.stream.IntStream;

public class 카운트다운 {
    public int[] solution(int start, int end) {
        return IntStream.rangeClosed(-start, -end).map(i -> -i).toArray();
//        return IntStream.rangeClosed(end, start).boxed()
//                .sorted(Comparator.reverseOrder())
//                .mapToInt(Integer::intValue)
//                .toArray();
    }
}

//public class lv0.카운트다운 {
//    public int[] solution(int start, int end) {
//        int[] answer = new int[start-end+1];
//
//        for(int i = 0; i < answer.length; i++) answer[i] = start - i;
//
//        return answer;
//    }
//}
