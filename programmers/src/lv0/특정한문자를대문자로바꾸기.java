package lv0;

public class 특정한문자를대문자로바꾸기 {
    public String solution(String my_string, String alp) {
        return my_string.replace(alp, alp.toUpperCase());
    }
}
