package lv0;

import java.util.Arrays;
import java.util.stream.Collectors;

public class 외계어사전 {
    public int solution(String[] spell, String[] dic) {
        String sortedString = Arrays.stream(spell).sorted().collect(Collectors.joining());
        for (int i = 0; i < dic.length; i++) {
            if (sortedString.equals(Arrays.stream(dic[i].split("")).sorted().collect(Collectors.joining()))) return 1;
        }
        return 2;
    }
}
