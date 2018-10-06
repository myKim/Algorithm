package my.baekjoon.q113;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Solution_11399 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int[] t = new int[N];
		for(int i=0; i<N; i++) {
			t[i] = Integer.parseInt(st.nextToken());
		}
		Arrays.sort(t);
		
		int[] dp = new int[N];
		dp[0] = t[0];
		int sum = dp[0];
		for(int i=1; i<dp.length; i++) {
			dp[i] = dp[i-1] + t[i];
			sum += dp[i];
		}
		
		bw.write(String.valueOf(sum));
		
		br.close();
		bw.close();
	}
	
}