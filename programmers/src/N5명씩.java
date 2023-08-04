// stream 문법을 활용해 조건을 필터링하고 배열로 만들면 되는 간단한 문제이다.
// 이 때, int 타입의 배열에서 string 타입의 배열로 변경하기 위해서 mapToObj나 boxed 등을 활용하고
// toArray 시에, 타입을 입력해 변환한다.

import java.util.stream.IntStream;

public class N5명씩 {
    public String[] solution(String[] names) {
        return IntStream.range(0, names.length)
                .filter(i -> i % 5 == 0)
                .mapToObj(i -> names[i])
                .toArray(String[]::new);
    }
}
