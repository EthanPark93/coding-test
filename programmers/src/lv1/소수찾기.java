package lv1;

import java.util.Arrays;

public class 소수찾기 {
    public int solution(int n) {
        int[] arr = new int[n+1];
        for (int i = 2; i < arr.length; i++) arr[i] = 1;

        for (int i = 2; i*i <= n; i++){
            if (arr[i] == 1) {
                for (int j = i+i; j <= n; j += i) {
                    arr[j] = 0;
                }
            }
        }

        return (int) Arrays.stream(arr).filter(i -> i == 1).count();
    }
}
