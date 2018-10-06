package my.baekjoon.q110;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Solution_11048_3 {

	static int[][] map;
	static int[][] dp;
	static final int[][] dir = {{1,0},{0,1},{1,1}};
	
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
		
		dp[1][1] = map[1][1];
		for(int i=1; i<=N; i++) {
			for(int j=1; j<=M; j++) {
				for(int[] d : dir) {
					int nextX = i + d[0];
					int nextY = j + d[1];
					
					if(isRange(nextX, nextY)) {
						dp[nextX][nextY] = Math.max(dp[nextX][nextY], dp[i][j]+map[nextX][nextY]);
					}
				}
			}
		}
		
		bw.write(String.valueOf(dp[N][M]));
		
		br.close();
		bw.close();
	}
	
	public static boolean isRange(int x, int y) {
		return (1<=x && x<map.length) && (1<=y && y<map[x].length);
	}
}
