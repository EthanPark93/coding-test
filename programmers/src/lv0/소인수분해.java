package lv0;

import java.util.*;

public class 소인수분해 {
    public int[] solution(int n) {
        LinkedHashSet<Integer> primeNumbers = new LinkedHashSet<>();

        int i = 2;
        while (i <= n) {
            if (n % i == 0) {
                primeNumbers.add(i);
                n /= i;
            } else {
                i++;
            }
        }

        return primeNumbers.stream().mapToInt(Integer::intValue).toArray();
    }
}
