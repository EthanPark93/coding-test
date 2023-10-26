package lv2;

public class 이진변환반복하기 {
    public int[] solution(String s) {
        int[] answer = new int[2];

        while(s.length() > 1) {
            int cntOne = 0;
            for(int i = 0; i < s.length(); i++) {
                if(s.charAt(i) == '0') answer[1]++;
                else cntOne++;
            }

            s = Integer.toBinaryString(cntOne);
            answer[0]++;
        }
        return answer;
    }
}

//class 이진변환반복하기 {
//    public int[] solution(String s) {
//        int[] answer = new int[2];
//        int temp;
//        while( !s.equals("1") ) {
//            answer[1] += s.length();
//            s = s.replaceAll("0", "");
//            temp = s.length();
//            s = Integer.toBinaryString(temp);

//            answer[0]++;
//            answer[1] -= temp;
//        }
//        return answer;
//    }
//}
