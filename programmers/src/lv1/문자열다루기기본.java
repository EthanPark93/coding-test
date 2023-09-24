package lv1;

public class 문자열다루기기본 {
    public boolean solution(String s) {
        return s.length() == s.replaceAll("[a-z|A-z]", "").length() && (s.length() == 4 || s.length() == 6);
    }
}

//class 문자열다루기기본 {
//    public boolean solution(String s) {
//        return (s.length() == 4 || s.length() == 6) && s.matches("[0-9]+");
//    }
//}
