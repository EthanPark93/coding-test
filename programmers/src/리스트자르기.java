// 스트림 구문을 사용해서 범위를 매번 설정해주는 방식으로 풀이하는 방법도 가능하지만,
// 더 좋은 풀이 방법은 시작, 끝 그리고 간격을 정의하여 알맞은 크기의 배열을 생성하고 값을 할당하여 최적화하는 것이라고 생각한다.

import java.util.stream.IntStream;

class 리스트자르기 {
    public int[] solution(int n, int[] slicer, int[] num_list) {
        int start = n == 1 ? 0 : slicer[0];
        int end = n == 2 ? num_list.length - 1 : slicer[1];
        int step = n == 4 ? slicer[2] : 1;

        int[] answer = new int[(end - start + step) / step];

        for (int i = start, j = 0; i <= end; i += step) {
            answer[j++] = num_list[i];
        }

        return answer;
    }
}

//public class 리스트자르기 {
//    public int[] solution(int n, int[] slicer, int[] num_list) {
//
//        if (n == 1) {
//            for (int i = 0; i <= slicer[1]; i++) {
//                return IntStream.rangeClosed(0,slicer[1]).map(s -> num_list[s]).toArray();
//            }
//        } else if (n == 2) {
//            for (int i = slicer[0]; i < num_list.length; i++) {
//                return IntStream.rangeClosed(slicer[0], num_list.length-1).map(s -> num_list[s]).toArray();
//            }
//        } else if (n == 3) {
//            for (int i = slicer[0]; i <= slicer[1]; i++) {
//                return IntStream.rangeClosed(slicer[0],slicer[1]).map(s -> num_list[s]).toArray();
//            }
//        } else {
//            for (int i = slicer[0]; i <= slicer[1]; i += slicer[2]) {
//                return IntStream.rangeClosed(slicer[0],slicer[1]).filter(x -> (x - slicer[0]) % slicer[2] == 0).map(s -> num_list[s]).toArray();
//            }
//        }
//
//        return num_list;
//    }
//}
