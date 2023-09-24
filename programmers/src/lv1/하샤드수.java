package lv1;

public class 하샤드수 {
    public boolean solution(int x) {
        int sum = 0;
        int t = x;

        while (t > 0) {
            sum += t % 10;
            t /= 10;
        }

        return x % sum == 0;
    }
}

//class 하샤드수 {
//    public boolean solution(int x) {
//        int sum = String.valueOf(x).chars().map(ch -> ch - '0').sum();
//        return x % sum == 0;
//    }
//}
