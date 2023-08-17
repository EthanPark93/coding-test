package lv0;

public class 간단한식계산하기 {
    public int solution(String binomial) {
        String[] parseBi = binomial.split(" ");

        switch (parseBi[1]) {
            case "+" :
                return Integer.parseInt(parseBi[0]) + Integer.parseInt(parseBi[2]);
            case "-" :
                return Integer.parseInt(parseBi[0]) - Integer.parseInt(parseBi[2]);

        }
        return Integer.parseInt(parseBi[0]) * Integer.parseInt(parseBi[2]);
    }
}
