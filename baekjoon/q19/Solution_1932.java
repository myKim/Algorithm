package my.baekjoon.q19;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Solution_1932 {

	public static int[][] dp;
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = null;
		
		int n = Integer.parseInt(br.readLine());
		int[][] tri = new int[n][];
		for(int i=0; i<tri.length; i++) {
			tri[i] = new int[i+1];
		}
		
		for(int i=0; i<tri.length; i++) {
			st = new StringTokenizer(br.readLine());
			
			for(int j=0; j<tri[i].length; j++) {
				tri[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		// Solution-
		dp = new int[n][];
		for(int i=0; i<dp.length; i++) {
			dp[i] = new int[i+1]; 
		}
		
		for(int i=0; i<tri[tri.length-1].length; i++) {
			dp[tri.length-1][i] = tri[tri.length-1][i]; 
		}
		for(int i=dp.length-2; i>=0; i--) {
			for(int j=0; j<tri[i].length; j++) {
				dp[i][j] = Math.max(dp[i+1][j], dp[i+1][j+1]) + tri[i][j];
			}
		}
		
		bw.write(String.valueOf(dp[0][0]));
		bw.newLine();
		
		br.close();
		bw.close();
	}
	
}
