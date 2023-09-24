package lv1;

public class 정수제곱근판별 {
    public long solution(long n) {
        if (n == 1) return 4;
        for (long i = 2; i <= n/2; i++) if ((i*i) == n) return (i+1)*(i+1);
        return -1;
    }
}

//class 정수제곱근판별 {
//    public long solution(long n) {
//        if (Math.pow((int)Math.sqrt(n), 2) == n) return (long) Math.pow(Math.sqrt(n) + 1, 2);
//        else return -1;
//    }
//}
