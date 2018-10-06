package my.baekjoon.q18;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Solution_1890_1 {
	
	static long[][] dp;
	static int[][] map;
	static int[][] dir = {{1,0},{0,1}};
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = null;
		
		int N = Integer.parseInt(br.readLine());
		
		map = new int[N][N];
		for(int i=0; i<N; i++) {
			st = new StringTokenizer(br.readLine());
			for(int j=0; j<N; j++) {
				map[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		// Solution
		dp = new long[N][N];
		for(long[] arr : dp) {
			Arrays.fill(arr, -1);
		}
		
		long res = dfs(0, 0);
		bw.write(String.valueOf(res));
		
		br.close();
		bw.close();
	}
	
	// 종착점 아닌 곳에도 0이 올수 있는점 고려해야함 
	public static long dfs(int x, int y) {
		if(dp[x][y] >= 0) {
			return dp[x][y];
		}
		if(x == map.length-1 && y == map[x].length-1) {  // 종점 도착
			return 1;
		}
		
		long res = 0;
		for(int[] d : dir) {
			if(map[x][y] != 0) {
				int nextX = x + (d[0] * map[x][y]);
				int nextY = y + (d[1] * map[x][y]);
				
				if(isRange(nextX, nextY)) {
					res += dfs(nextX, nextY);
				}
			}
		}
		dp[x][y] = res;
		
		return res;
	}
	
	public static boolean isRange(int x, int y) {
		return (0<=x) && (x<map.length) && (0<=y) && (y<map[x].length);
	}
	
}
