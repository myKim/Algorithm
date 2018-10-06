package my.baekjoon.q100;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class Solution_10026 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine());
		
		char[][] map1 = new char[N][];  // 일반 맵
		for(int i=0; i<N; i++) {
			map1[i] = br.readLine().toCharArray();
		}
		char[][] map2 = createColorBlindMap(map1);  // 색약용 맵
		
		bw.write(bfs(map1) + " " + bfs(map2));  // BFS로 결과 출력
		
		br.close();
		bw.close();
	}
	
	// 일반 맵을 바탕으로 적록색약 맵 생성 (그린을 모두 레드로 변경)
	public static char[][] createColorBlindMap(char[][] map) {
		char[][] res = new char[map.length][];
		
		for(int i=0; i<res.length; i++) {
			res[i] = new char[map[i].length];
			
			for(int j=0; j<res[i].length; j++) {
				res[i][j] = (map[i][j] == 'G') ? 'R' : map[i][j];
			}
		}
		
		return res;
	}
	
	// BFS 로 탐색 후 Group 개수 반환
	public static int bfs(char[][] map) {
		int[][] dir = {{0,1},{1,0},{0,-1},{-1,0}};  // 이동방향
		int[][] visit = new int[map.length][map[0].length];  // 방문여부 (0: 미방문)
		for(int[] arr : visit) {
			Arrays.fill(arr, 0);
		}
		
		int group = 0;
		for(int i=0; i<map.length; i++) {
			for(int j=0; j<map[i].length; j++) {
				if(visit[i][j] > 0) continue;  // 이미 처리한 좌표일 경우 continue
				
				Queue<Pair> q = new LinkedList<>();
				q.offer(new Pair(i, j));
				visit[i][j] = ++group;
				
				while(!q.isEmpty()) {
					Pair p = q.poll();
					
					for(int[] d : dir) {
						int nextX = p.x + d[0];
						int nextY = p.y + d[1];
						
						if(isRange(map, nextX, nextY)) {
							if(map[i][j] == map[nextX][nextY] && visit[nextX][nextY] <= 0) {
								q.offer(new Pair(nextX, nextY));
								visit[nextX][nextY] = group;
							}
						}
					}
				}
			}
		}
		return group;
	}
	
	// 좌표가 맵 내부에 있는지 확인
	public static boolean isRange(char[][] map, int x, int y) {
		return (0 <= x && x < map.length) && (0 <= y && y < map[x].length);
	}
	
	// 좌표 class
	public static class Pair {
		int x;
		int y;
		public Pair(int x, int y) {
			this.x = x;
			this.y = y;
		}
	}
}
