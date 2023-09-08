// 점수의 합과 인덱스를 저장하는 배열을 만들고 점수의 내림차순으로 정렬 한 뒤
// 앞에서부터 등수를 저장하도록 만든다. 이 때 이 전 등수와 점수가 같다면 등수의 수를 하나 내려준다.

// 다른 방법으로는 점수의 합을 리스트에 저장한 뒤
// 역순으로 저장한 score 배열에 indexOf를 사용해 가장 앞에 있는 인덱스+1을 점수로 저장한다.

package lv0;

import java.util.*;

public class 등수매기기 {
    public int[] solution(int[][] score) {
        int n = score.length;
        int[] result = new int[n];

        int[][] sums = new int[n][2];
        for (int i = 0; i < n; i++) {
            sums[i][0] = score[i][0] + score[i][1];
            sums[i][1] = i;
        }

        Arrays.sort(sums, (a, b) -> Integer.compare(b[0], a[0]));

        int rank = 1;
        for (int i = 0; i < n; i++) {
            int index = sums[i][1];
            result[index] = rank;

            if (i < n - 1 && sums[i][0] != sums[i + 1][0]) {
                rank = i + 2;
            }
        }

        return result;
    }
}

//class 둥수매기기 {
//    public int[] solution(int[][] score) {
//        List<Integer> scoreList = new ArrayList<>();
//        for(int[] t : score){
//            scoreList.add(t[0] + t[1]);
//        }
//        scoreList.sort(Comparator.reverseOrder());
//
//        int[] answer = new int[score.length];
//        for(int i=0; i<score.length; i++){
//            answer[i] = scoreList.indexOf(score[i][0] + score[i][1])+1;
//        }
//        return answer;
//    }
//}
