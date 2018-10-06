package my.baekjoon.q18;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Solution_1890_2 {

	static int[][] map;
	static long[][] dp;
	static final int[][] dir = {{1,0},{0,1}};
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine());
		
		map = new int[N+1][N+1];
		for(int i=1; i<map.length; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			for(int j=1; j<map[i].length; j++) {
				map[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		dp = new long[N+1][N+1];
		for(long[] d : dp) {
			Arrays.fill(d, -1);
		}
		
		long res = dfs(1, 1);
		bw.write(String.valueOf(res));
		
		br.close();
		bw.close();
	}
	
	
	public static long dfs(int x, int y) {
		if(x == map.length-1 && y == map[x].length-1) {
			return dp[x][y] = 1;
		}
		
		if(dp[x][y] < 0) {
			long res = 0;
			if(map[x][y] != 0) {
				for(int[] d : dir) {
					int nextX = x + (d[0] * map[x][y]);
					int nextY = y + (d[1] * map[x][y]);
					
					if(isRange(nextX, nextY)) {
						res += dfs(nextX, nextY);
					}
				}
			}
			dp[x][y] = res;
		}
		return dp[x][y];
	}
	
	public static boolean isRange(int x, int y) {
		return (1<=x && x<map.length) && (1<=y && y<map[x].length);
	}
	
}
