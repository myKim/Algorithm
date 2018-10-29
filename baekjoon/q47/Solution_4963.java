package my.baekjoon.q49;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Solution_4963 {

	static boolean[][] visit;
	static final int[][] dir = {{-1,-1},{-1,0},{-1,1},{0,-1},{0,1},{1,-1},{1,0},{1,1}};
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		while(true) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int w = Integer.parseInt(st.nextToken());
			int h = Integer.parseInt(st.nextToken());
			
			if(w==0 && h==0) break;
			
			int[][] map = new int[h][w];
			for(int i=0; i<h; i++) {
				st = new StringTokenizer(br.readLine());
				for(int j=0; j<w; j++) {
					map[i][j] = Integer.parseInt(st.nextToken());
				}
			}
			
			bw.write(String.valueOf(solution(map)));
			bw.newLine();
		}
		
		br.close();
		bw.close();
	}
	
	private static int solution(int[][] map) {
		visit = new boolean[map.length][map[0].length];
		for(boolean[] v : visit) {
			Arrays.fill(v, false);
		}
		
		int res = 0;
		for(int i=0; i<map.length; i++) {
			for(int j=0; j<map[i].length; j++) {
				if(!visit[i][j] && map[i][j] > 0) {
					res++;
					bfs(map, i, j);
				}
			}
		}
		
		return res;
	}
	
	private static void bfs(int[][] map, int x, int y) {
		visit[x][y] = true;
		
		for(int[] d : dir) {
			int nextX = x + d[0];
			int nextY = y + d[1];
			
			if(isRange(map, nextX, nextY) && !visit[nextX][nextY] && map[nextX][nextY] > 0) {
				bfs(map, nextX, nextY);
			}
		}
	}
	
	private static boolean isRange(int[][] map, int x, int y) {
		return (0<=x && x<map.length) && (0<=y && y<map[x].length);
	}
}
