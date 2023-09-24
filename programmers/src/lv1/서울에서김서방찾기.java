package lv1;

import java.util.stream.IntStream;

public class 서울에서김서방찾기 {
    public String solution(String[] seoul) {
        return "김서방은 " + IntStream.range(0, seoul.length).filter(i -> seoul[i].equals("Kim")).findFirst().getAsInt() + "에 있다";
    }
}
