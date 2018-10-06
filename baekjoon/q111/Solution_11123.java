package my.baekjoon.q111;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Solution_11123 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int T = Integer.parseInt(br.readLine());
		while(T-- > 0) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int H = Integer.parseInt(st.nextToken());
			int W = Integer.parseInt(st.nextToken());
			
			char[][] grid = new char[H][];
			for(int i=0; i<grid.length; i++) {
				grid[i] = br.readLine().toCharArray();
			}
			
			int groupCnt = 0;
			for(int i=0; i<grid.length; i++) {
				for(int j=0; j<grid[i].length; j++) {
					if(dfs(grid, i, j)) {
						groupCnt++;
					}
				}
			}
			bw.write(String.valueOf(groupCnt));
			bw.newLine();
		}
		
		br.close();
		bw.close();
	}
	
	static int[][] dir = {{1,0},{0,1},{-1,0},{0,-1}};
	
	public static boolean dfs(char[][] grid, int x, int y) {
		if(!isRange(grid, x, y) || grid[x][y] != '#') {
			return false;
		}
		
		grid[x][y] = '.'; // 방문 처리
		for(int[] d : dir) {
			int nextX = x + d[0];
			int nextY = y + d[1];
			
			dfs(grid, nextX, nextY);
		}
		return true;
	}
	
	public static boolean isRange(char[][] grid, int x, int y) {
		return (0<=x && x<grid.length) && (0<=y && y<grid[x].length);
	}
}
