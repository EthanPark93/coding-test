package lv0;

public class 삼각형의완성조건2 {
    public int solution(int[] sides) {
        int min = Math.min(sides[0], sides[1]);
        return min * 2 - 1;
    }
}

//class 삼각형의완성조건2 {
//    public int solution(int[] sides) {
//        int bigValue = Math.max(sides[0], sides[1]);
//        int smallValue = Math.min(sides[0], sides[1]);
//
//        int lowLimit = bigValue - smallValue;
//        int highLimit = bigValue + smallValue;
//
//        return highLimit - lowLimit - 1;
//    }
//}