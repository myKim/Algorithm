package my.baekjoon.q18;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Solution_1890_3 {

	static int[][] map;
	static long[][] dp;
	
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
			Arrays.fill(d, 0);
		}
		
		dp[1][1] = 1;
		for(int i=1; i<=N; i++) {
			for(int j=1; j<=N; j++) {
				if(map[i][j] > 0) {
					int k = map[i][j];
					if(i+k <= N) {
						dp[i+k][j] += dp[i][j];
					}
					if(j+k <= N) {
						dp[i][j+k] += dp[i][j];
					}
				}
			}
		}
		
		long res = dp[N][N];
		bw.write(String.valueOf(res));
		
		br.close();
		bw.close();
	}
	
	public static boolean isRange(int x, int y) {
		return (1<=x && x<map.length) && (1<=y && y<map[x].length);
	}
	
}
