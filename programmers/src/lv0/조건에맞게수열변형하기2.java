package lv0;// 첫 번째 방식은 배열을 순회하며 해당 조건에 따라 배열값을 변형하도록 만들고, 이를 무한루프로 만들어 플래그 값으로 변화값을 판별한다.
// 두 번째 방식은 컨셉이 재미있다. 각각의 스트림 요소에 대해 더이상 변형되지 않는 count를 구하고, 최댓값을 구하는 방식이다.

import java.util.Arrays;

public class 조건에맞게수열변형하기2 {
    public int solution(int[] arr) {
        for (int j = 1; ;j++) {
            boolean flag = false;

            for (int i = 0; i < arr.length; i++) {
                if (arr[i] >= 50 && arr[i] % 2 == 0) {
                    arr[i] /= 2;
                    flag = true;
                }
                else if (arr[i] < 50 && arr[i] % 2 == 1) {
                    arr[i] *= 2;
                    arr[i]++;
                    flag = true;
                }
            }

             if (!flag) return j-1;
        }
    }
}

//class Solut조건에맞게수열변형하기2ion {
//    public int solution(int[] arr) {
//        return Arrays.stream(arr).map(i -> cntAction(i)).max().getAsInt();
//    }
//
//    private int cntAction(int n) {
//
//        int cnt = 0;
//        boolean flag = true;
//
//        while (flag) {
//
//            if (n % 2 == 0 && 50 <= n) {
//                n /= 2;
//                cnt++;
//            } else if (n % 2 == 1 && n < 50) {
//                n *= 2;
//                n += 1;
//                cnt++;
//            } else {
//                flag = false;
//            }
//        }
//        return cnt;
//    }
//}
