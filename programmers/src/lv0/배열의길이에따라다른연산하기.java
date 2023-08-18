// 루프 주기가 2이므로 시작 인덱스만 잘 잡아주면 복잡한 스트림 연산이나 반복문이 필요없다.
// 배열 길이가 짝수일때, 짝수 번째부터 시작하여 i가 2씩 증가하도록 설정하면 쉽게 해결 가능하다.

package lv0;

public class 배열의길이에따라다른연산하기 {
    public int[] solution(int[] arr, int n) {
        for(int i = arr.length % 2 == 0 ? 1 : 0; i < arr.length; i += 2) arr[i] += n;

        return arr;
    }
}
