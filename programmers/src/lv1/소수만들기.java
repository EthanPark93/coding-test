package lv1;

public class 소수만들기 {
    public int solution(int[] nums) {
        int answer = 0;

        for (int i = 0; i < nums.length - 2; i++) {
            for (int j = i+1; j < nums.length - 1; j++) {
                last:
                for (int k = j+1; k < nums.length; k++) {
                    int sum = nums[i] + nums[j] + nums[k];
                    int t = 0;
                    for (int l = 2; l*l <= sum; l++) {
                        if (sum % l == 0) t++;
                        if (t > 0) continue last;
                    }
                    answer++;
                }
            }
        }

        return answer;
    }
}
