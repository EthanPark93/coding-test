package lv1;

import java.util.HashSet;
import java.util.Set;

public class 폰켓몬 {
    public int solution(int[] nums) {
        Set<Integer> set = new HashSet<>();

        for (int i = 0; i < nums.length; i++) set.add(nums[i]);

        return Integer.min(set.size(), nums.length / 2);
    }
}
