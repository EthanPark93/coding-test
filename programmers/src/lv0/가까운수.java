package lv0;

public class 가까운수 {
    public int solution(int[] array, int n) {
        int minDiff = Math.abs(array[0] - n); // 첫 번째 원소와 n과의 차이를 초기 최소값으로 설정
        int closestValue = array[0]; // 가장 가까운 값을 저장할 변수

        for (int i = 1; i < array.length; i++) {
            int currentDiff = Math.abs(array[i] - n);
            if (currentDiff < minDiff || (currentDiff == minDiff && array[i] < closestValue)) {
                // 현재 원소와 n과의 차이가 더 작거나, 차이가 같지만 더 작은 값을 찾으면 업데이트
                minDiff = currentDiff;
                closestValue = array[i];
            }
        }

        return closestValue;
    }
}
