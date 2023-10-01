package lv1;

import java.util.HashMap;

public class 성격유형검사하기 {
    public String solution(String[] survey, int[] choices) {
        String answer = "";
        HashMap<Character, Integer> hm = new HashMap<>();

        hm.put('R', 0);
        hm.put('T', 0);
        hm.put('C', 0);
        hm.put('F', 0);
        hm.put('J', 0);
        hm.put('M', 0);
        hm.put('A', 0);
        hm.put('N', 0);

        for (int i = 0; i < survey.length; i++) {
            if (choices[i] > 4) hm.put(survey[i].charAt(1), hm.get(survey[i].charAt(1)) + choices[i] - 4);
            else if (choices[i] < 4) hm.put(survey[i].charAt(0), hm.get(survey[i].charAt(0)) + 4 - choices[i]);
        }

        if (hm.get('R') >= hm.get('T')) answer = "R";
        else answer = "T";

        if (hm.get('C') >= hm.get('F')) answer += "C";
        else answer += "F";

        if (hm.get('J') >= hm.get('M')) answer += "J";
        else answer += "M";

        if (hm.get('A') >= hm.get('N')) answer += "A";
        else answer += "N";

        return answer;
    }
}

//class 성격유형검사하기 {
//    public String solution(String[] survey, int[] choices) {
//        String answer = "";
//        char [][] type = {{'R', 'T'}, {'C', 'F'}, {'J', 'M'}, {'A', 'N'}};
//        int [] score = {0, 3, 2, 1, 0, 1, 2, 3};
//        HashMap<Character, Integer> point = new HashMap<Character, Integer>();
//
//        // 점수 기록할 배열 초기화
//        for (char[] t : type) {
//            point.put(t[0], 0);
//            point.put(t[1], 0);
//        }
//
//        // 점수 기록
//        for (int idx = 0; idx < choices.length; idx++){
//            if(choices[idx] > 4){
//                point.put(survey[idx].charAt(1), point.get(survey[idx].charAt(1)) + score[choices[idx]]);
//            } else {
//                point.put(survey[idx].charAt(0), point.get(survey[idx].charAt(0)) + score[choices[idx]]);
//            }
//        }
//
//        // 지표 별 점수 비교 후 유형 기입
//        for (char[] t : type) {
//            answer += (point.get(t[1]) <= point.get(t[0])) ? t[0] : t[1];
//        }
//
//        return answer;
//    }
//}
