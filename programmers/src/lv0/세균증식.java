// 조건에 따라 두배 곱을 t번 실행하도록 하는 방법이 있고
// 2진수의 특성으로 인해 시프트 연산을 하여 두배씩 증가시키는 방법이 있다.
// 결국 n * 2^t를 구하기만 하면 된다. (마지막 방법)

package lv0;

public class 세균증식 {
    public int solution(int n, int t) {
        for (int i = 0; i < t; i++) n *= 2;
        return n;
    }
}

//class 세균증식 {
//    public int solution(int n, int t) {
//        return n << t;
//    }
//}

//class 세균증식 {
//    public int solution(int n, int t) {
//        return (int) (n * Math.pow(2, t));
//    }
//}