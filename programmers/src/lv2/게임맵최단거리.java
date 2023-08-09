package lv2;

// BFS 넓이우선탐색 알고리즘이다.
// 방문 여부 배열과 직전 방문 큐가 문제 해결의 핵심.
// 최초 방문 좌표를 큐에 추가하고 방문처리한다.
// 방문할 좌표 변화량을 배열로 정의하고 반복문으로 처리한다.
// 유효 좌표인지 검증한다.
// 이미 방문한 곳인지 벽인지 검증하고 방문할 큐에 추가한다.
// 문제에서 방문 가능 맵위치는 1이기 때문에, ++ 처리하면 이동 거리가 된다.

import java.util.*;

class 게임맵최단거리 {
    public int solution(int[][] maps) {
        // 방문여부 배열, 기본 초기화 false
        boolean[][] visited = new boolean[maps.length][maps[0].length];
        Queue<int[]> queue = new LinkedList<>();

        int[] dy = new int[] {0,0,1,-1};
        int[] dx = new int[] {1,-1,0,0};

        queue.add(new int[] {0,0});
        visited[0][0] = true;

        while(!queue.isEmpty()) {
            int[] now = queue.poll();

            for (int i = 0; i < 4; i++) {
                int y = now[0] + dy[i];
                int x = now[1] + dx[i];

                if( y >= 0 && x >= 0 && y < maps.length && x < maps[0].length) { // 범위 검증
                    if ( maps[y][x] == 1) { // 갈수 있는 곳이면서, 방문했었는지 검증

                        queue.add(new int[] {y,x});
                        maps[y][x] = maps[now[0]][now[1]] + 1;
                        visited[y][x] = true;
                    }

                }
            }
        }

        return visited[maps.length-1][maps[0].length-1] ? maps[maps.length-1][maps[0].length-1] : -1;
    }
}
