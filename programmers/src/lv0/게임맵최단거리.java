package lv0;

import java.util.*;

class 게임맵최단거리 {
    public int solution(int[][] maps) {
        boolean[][] visited = new boolean[maps.length][maps[0].length]; // 방문여부 배열, 기본 초기화 false
        Queue<int[]> queue = new LinkedList<>();

        int[] dy = new int[] {-1,1,0,0};
        int[] dx = new int[] {0,0,-1,1};

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
