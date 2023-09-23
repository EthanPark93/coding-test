package lv1;

public class 가장가까운다른글자 {
    public int[] solution(String s) {
        int[] result = new int[s.length()];

        for (int i = 0; i < s.length(); i++){
            String sub = s.substring(0,i);

            if (sub.indexOf(s.charAt(i)) == -1) result[i] = -1;
            else result[i] = i - sub.lastIndexOf(s.charAt(i));
        }

        return result;
    }
}
