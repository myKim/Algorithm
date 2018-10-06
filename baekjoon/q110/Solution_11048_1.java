package my.baekjoon.q110;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Solution_11048_1 {

	static int[][] map;
	static int[][] dp;
	static final int[][] dir = {{-1,0},{0,-1},{-1,-1}};
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		map = new int[N+1][M+1];
		for(int i=1; i<map.length; i++) {
			st = new StringTokenizer(br.readLine());
			for(int j=1; j<map[i].length; j++) {
				map[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		dp = new int[N+1][M+1];
		for(int[] d : dp) {
			Arrays.fill(d, -1);
		}
		
		int res = dfs(N, M);
		
		bw.write(String.valueOf(res));
		
		br.close();
		bw.close();
	}
	
	public static int dfs(int x, int y) {
		if(x == 1 && y == 1) {
			return dp[1][1] = map[1][1];
		}
		
		if(dp[x][y] == -1) {
			int max = 0;
			for(int[] d : dir) {
				int nextX = d[0] + x;
				int nextY = d[1] + y;
				
				if(isRange(nextX, nextY)) {
					max = Math.max(max, dfs(nextX, nextY));
				}
			}
			dp[x][y] = max + map[x][y];
		}
		return dp[x][y];
	}
	
	public static boolean isRange(int x, int y) {
		return (1<=x && x<map.length) && (1<=y && y<map[x].length);
	}
	
}
