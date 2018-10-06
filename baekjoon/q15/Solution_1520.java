package my.baekjoon.q15;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Solution_1520 {

	static int[][] map;
	static int[][] dp;
	static final int[][] dir = {{1,0},{0,1},{-1,0},{0,-1}};
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int M = Integer.parseInt(st.nextToken());
		int N = Integer.parseInt(st.nextToken());
		map = new int[M][N];
		
		for(int i=0; i<M; i++) {
			st = new StringTokenizer(br.readLine());
			for(int j=0; j<N; j++) {
				map[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		// Solution
		dp = new int[M][N];
		for(int[] arr : dp) {
			Arrays.fill(arr, -1);
		}
		
		int res = go(M-1, N-1);
		
		bw.write(String.valueOf(res));
		
		br.close();
		bw.close();
	}
	
	public static int go(int x, int y) {
		if(x == 0 && y == 0) {
			return 1;
		}
		
		if(dp[x][y] == -1) {
			dp[x][y] = 0;
			for(int[] d : dir) {
				int nextX = x + d[0];
				int nextY = y + d[1];
				
				if(isRange(nextX, nextY) && map[x][y] < map[nextX][nextY]) {
					dp[x][y] += go(nextX, nextY);
				}
			}
		}
		return dp[x][y];
	}
	
	public static boolean isRange(int x, int y) {
		return (0<=x && x<map.length) && (0<=y && y<map[x].length);
	}
	
}