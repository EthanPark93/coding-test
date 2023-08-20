// StringBuilder 등을 이용해 복잡하게 풀 수도 있으나
// 배열을 통한 단순 구현문제이므로 루프를 정확하게 설정하면 무난하게 풀이할 수 있다.

package lv0;

public class 그림확대 {
    public String[] solution(String[] picture, int k) {
        String[] answer = new String[picture.length * k];

        for (int i = 0; i < picture.length; i++) {
            String t = "";
            for (String c : picture[i].split("")) {
                for (int j = 0; j < k; j++) t += c;
            }
            for (int j = i * k; j < (i * k) + k; j++) answer[j] = t;
        }

        return answer;
    }
}
