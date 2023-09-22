package lv0;

public class 모스부호1 {
    public String solution(String letter) {
        String answer = "";
        String[] mos = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};

        String[] letterAr = letter.split(" ");

        for (int i = 0; i < letterAr.length; i++) {
            for (int j = 0; j < mos.length; j++) {
                if (letterAr[i].equals(mos[j])) answer += (char) (j + 97);
            }
        }

        return answer;
    }
}
