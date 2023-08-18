// 첫 번째 방식을 사용할때 CopyOf와 CopyOfRange를 잘 구분해야한다.
// 두 번째 방식으로 stream을 사용하면 한 줄로 코딩이 가능하지만, 스트림으로 변형 및 다시 배열로 변환에 리소스가 낭비될 수 있다.

package lv0;

import java.util.Arrays;

public class 뒤에서5등위로 {
    public int[] solution(int[] num_list) {
        Arrays.sort(num_list);
        return Arrays.copyOfRange(num_list, 5, num_list.length);
    }
}

//class 뒤에서5등위로 {
//    public int[] solution(int[] numList) {
//        return Arrays.stream(numList).sorted().skip(5).toArray();
//    }
//}
