package lv0;

public class 영어가싫어요 {
    public long solution(String numbers) {
        String[] numbersAr = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};

        for (int i = 0; i < 10; i++) numbers = numbers.replaceAll(numbersAr[i], String.valueOf(i));

        return Long.parseLong(numbers);
    }
}
