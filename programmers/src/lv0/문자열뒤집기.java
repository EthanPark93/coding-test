package lv0;

public class 문자열뒤집기 {
    public String solution(String my_string) {
        String answer = "";
        String[] sAr = my_string.split("");

        for (int i = my_string.length()-1; i >= 0; i--) answer += sAr[i];

        return answer;
    }
}

//class 문자열뒤집기 {
//    public String solution(String myString) {
//        return new StringBuilder(myString).reverse().toString();
//    }
//}
