// 풀이가 필요 없는 문제. 문제 요구사항대로 q로 나눈 나머지가 r인 곳의 인덱스에서 정답 문자열에 이어붙인다.

public class qrcode {
    public String solution(int q, int r, String code) {
        String answer = "";

        for (int i = 0; i < code.length(); i++) if (i % q == r) answer += code.charAt(i);

        return answer;
    }
}
