package lv0;

import java.util.Stack;

public class 컨트롤제트 {
    public int solution(String s) {
        int answer = 0;
        String[] sAr = s.split(" ");

        for (int i = 0; i < sAr.length - 1; i++) {
            if (!sAr[i].equals("Z") && !sAr[i+1].equals("Z")) {
                answer += Integer.parseInt(sAr[i]);
            }
        }

        if (!sAr[sAr.length-1].equals("Z")) answer += Integer.parseInt(sAr[sAr.length-1]);

        return answer;
    }
}

//class 컨트롤제트 {
//    public int solution(String s) {
//        Stack<Integer> stack = new Stack<>();
//
//        for (String w : s.split(" ")) {
//            if (w.equals("Z")) stack.pop();
//            else stack.push(Integer.parseInt(w));
//        }
//        return stack.stream().reduce((x, y) -> x +y).orElse(-1);
//    }
//}
