// HashSet을 사용하면 스트림 변환 후 sorted를 사용해야하지만
// TreeSet을 사용하면 add시에 정렬이 되기때문에 보다 적합한 자료구조라고 볼 수 있다.

package lv1;

import java.util.Set;
import java.util.TreeSet;

public class 두개뽑아서더하기 {
    public int[] solution(int[] numbers) {
        Set<Integer> set = new TreeSet<>();

        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = i+1; j < numbers.length; j++) {
                set.add(numbers[i] + numbers[j]);
            }
        }

        return set.stream().mapToInt(Integer::intValue).toArray();
    }
}
