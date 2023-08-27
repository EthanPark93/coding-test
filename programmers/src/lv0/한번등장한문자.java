package lv0;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class 한번등장한문자 {
    public String solution(String s) {
        Map<Character, Long> charCount = s.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(c -> c, Collectors.counting()));

        return s.chars()
                .mapToObj(c -> (char) c)
                .filter(c -> charCount.get(c) == 1)
                .sorted()
                .collect(StringBuilder::new, StringBuilder::append, StringBuilder::append)
                .toString();
    }
}

//class 한번등장한문자 {
//    public String solution(String s) {
//        return Arrays.stream(s.split(""))
//                .collect(Collectors.groupingBy(s1 -> s1))
//                .entrySet()
//                .stream()
//                .filter(entry -> entry.getValue().size() <= 1)
//                .map(Map.Entry::getKey)
//                .sorted()
//                .collect(Collectors.joining());
//    }
//}
//
//class 한번등장한문자 {
//    public String solution(String s) {
//        int[] alpha = new int[26];
//        for(char c : s.toCharArray()){
//            alpha[c - 'a']++;
//        }
//
//        StringBuilder answer = new StringBuilder();
//        for(int i = 0; i < 26; i++){
//            if(alpha[i] == 1){
//                answer.append((char)(i + 'a'));
//            }
//        }
//        return answer.toString();
//    }
//}
