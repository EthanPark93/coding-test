// 두개 이상 겹치는 선분을 구하는 것은 얼핏 어려워 보이지만 좌표평면 전체 길이 201을 배열로 만들고
// 선분을 담은 2차 배열을 순회하며 좌표평면에 표시해주어 2 이상인 값의 갯수를 세면 된다.

package lv0;

public class 겹치는선분의길이 {
    public int solution(int[][] lines) {
        int[] arr = new int[201];
        int answer = 0;

        for(int i = 0; i < lines.length; i++)
            for(int j = lines[i][0] + 100; j < lines[i][1] + 100; j++)
                arr[j]++;

        for(int i = 0; i < 201; i++)
            if(arr[i] > 1)
                answer++;

        return answer;
    }
}
