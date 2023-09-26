package lv1;

public class 옹알이2 {
    public int solution(String[] babbling) {
        int answer = 0;

        outer:
        for (int i = 0; i < babbling.length; i++) {
            babbling[i] = babbling[i].replace("aya", "1")
                    .replace("ye", "2")
                    .replace("woo", "3")
                    .replace("ma", "4");

            for (int j = 0; j < babbling[i].length()-1; j++) {
                if (babbling[i].charAt(j) == babbling[i].charAt(j+1)) continue outer;
            }

            try {
                Integer.parseInt(babbling[i]);
                answer++;
            } catch (Exception e) {

            }
        }

        return answer;
    }
}

//public class 옹알이2 {
//    public int solution(String[] babbling) {
//        int answer = 0;
//        for(int i=0; i<babbling.length; i++){
//            babbling[i] = babbling[i].replaceAll("ayaaya|yeye|woowoo|mama","1");
//            babbling[i] = babbling[i].replaceAll("aya|ye|woo|ma"," ");
//            babbling[i] = babbling[i].replaceAll(" ","");
//            if(babbling[i].equals("")) answer++;
//        }
//        return answer;
//    }
//}
