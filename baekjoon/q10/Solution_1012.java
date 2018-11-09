package my.baekjoon.q10;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Solution_1012 {

	public static final int[][] dir = {{1,0},{0,1},{-1,0},{0,-1}};
	public static int[][] map;
	public static int[][] visit;
	
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int T = Integer.parseInt(br.readLine());
		while(T-- > 0) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int M = Integer.parseInt(st.nextToken());
			int N = Integer.parseInt(st.nextToken());
			int K = Integer.parseInt(st.nextToken());
			
			map = new int[N][M];
			visit = new int[N][M];
			for(int i=0; i<N; i++) {
				Arrays.fill(map[i], 0);
				Arrays.fill(visit[i], 0);
			}
			
			while(K-- > 0) {
				st = new StringTokenizer(br.readLine());
				int X = Integer.parseInt(st.nextToken());
				int Y = Integer.parseInt(st.nextToken());
				map[Y][X] = 1;
			}
			
			// Solution
			int group = 0;
			for(int i=0; i<N; i++) {
				for(int j=0; j<M; j++) {
					if(visit[i][j]==0 && map[i][j]==1) {
						dfs(map, j, i, ++group);
					}
				}
			}
			
			bw.write(String.valueOf(group));
			bw.newLine();
		}
		
		br.close();
		bw.close();
	}
	
	public static void dfs(int[][] map, int x, int y, int group) {
		if(visit[y][x]!=0 || map[y][x]!=1) return;
		
		visit[y][x] = group;
		
		for(int[] d : dir) {
			int nextX = x + d[0];
			int nextY = y + d[1];
			
			if(isRange(map, nextX, nextY) && map[nextY][nextX]==1 && visit[nextY][nextX]==0) {
				dfs(map, nextX, nextY, group);
			}
		}
	}
	
	public static boolean isRange(int[][] map, int x, int y) {
		return (0<=y && y<map.length) && (0<=x && x<map[y].length);
	}

}
