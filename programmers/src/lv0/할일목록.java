package lv0;// 첫 번째 방식은 stream을 활용해, 조건에 맞는 인덱스를 필터링하고, String 타입의 배열로 맵핑한다.
// 두 번째 방식은, 인덱스를 순회하며, 조건에 맞을 경우 문자열에 쉼표와 함께 이어붙인다. 이후 split 메서드를 활용해 분리하여 리턴한다.

import java.util.stream.IntStream;

public class 할일목록 {
    public String[] solution(String[] todo_list, boolean[] finished) {
        return IntStream.range(0, finished.length)
                .filter(i -> finished[i] == false)
                .mapToObj(i -> todo_list[i])
                .toArray(String[]::new);
    }
}

//class lv0.할일목록 {
//    public String[] solution(String[] todo_list, boolean[] finished) {
//        String str = "";
//        for(int i = 0; i < finished.length; i++) str = finished[i]==false ? str+todo_list[i]+"," : str;
//
//        return str.split(",");
//    }
//}
