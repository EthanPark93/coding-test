package lv0;// 짝수 번째와 홀수 번째의 합을 루프를 통해 조건부로 합하고, 그 중 큰 값을 삼항연산자로 리턴한다.

public class 홀수vs짝수 {
    public int solution(int[] num_list) {
        int odd = 0, even = 0;
        for (int i = 0; i < num_list.length; i++) {
            if (i % 2 == 0) odd += num_list[i];
            else  even += num_list[i];
        }
        return odd > even ? odd : even;
    }
}
