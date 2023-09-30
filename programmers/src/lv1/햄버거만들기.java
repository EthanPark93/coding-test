package lv1;

public class 햄버거만들기 {
    public int solution(int[] ingredient) {
        int answer = 0;
        StringBuilder sb = new StringBuilder();

        for (int i : ingredient) {
            sb.append(i);

            while (sb.length() >= 4 && sb.substring(sb.length() - 4).equals("1231")) {
                answer++;
                sb.setLength(sb.length() - 4);
            }
        }

        return answer;
    }
}
