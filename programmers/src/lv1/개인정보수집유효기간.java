// 핵심 아이디어는 년,월,일의 형식을 유지할 필요가 없다는 것이다.
// 모든 달이 28로 동일함을 가정하기 때문에, 28을 곱하면서 총 날짜 수로 변환하여 비교가 가능하다.

package lv1;

import java.util.*;

public class 개인정보수집유효기간 {
    public int[] solution(String today, String[] terms, String[] privacies) {
        List<Integer> answer = new ArrayList<>();
        Map<String, Integer> termMap = new HashMap<>();
        int date = getDate(today);

        for (String s : terms) {
            String[] term = s.split(" ");

            termMap.put(term[0], Integer.parseInt(term[1]));
        }
        for (int i = 0; i < privacies.length; i++) {
            String[] privacy = privacies[i].split(" ");

            if (getDate(privacy[0]) + (termMap.get(privacy[1]) * 28) <= date) {
                answer.add(i + 1);
            }
        }
        return answer.stream().mapToInt(integer -> integer).toArray();
    }

    private int getDate(String today) {
        String[] date = today.split("\\.");
        int year = Integer.parseInt(date[0]);
        int month = Integer.parseInt(date[1]);
        int day = Integer.parseInt(date[2]);
        return (year * 12 * 28) + (month * 28) + day;
    }
}
