package lv2;

public class 연속된부분수열의합 {
    public int[] solution(int[] sequence, int k) {
        int[] answer = new int[] {0, 1000000};
        int left = 0;
        int right = 0;
        int sum = sequence[0];

        while (right < sequence.length){
            if(sum == k && right - left < answer[1] - answer[0]){
                answer[0] = left;
                answer[1] = right;
            }

            if(sum <= k){
                if(++right < sequence.length) sum += sequence[right];
            } else {
                if(left < sequence.length) sum -= sequence[left++];
            }
        }

        return answer;
    }
}
