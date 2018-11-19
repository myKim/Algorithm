package my.baekjoon.q117;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution_11722 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		int[] arr = new int[N];
		int[] dp = new int[N];
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i=0; i<arr.length; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		for(int i=0; i<dp.length; i++) {
			dp[i] = 1;
			
			for(int j=i-1; j>=0; j--) {
				if(arr[j] > arr[i] && dp[j]+1 > dp[i]) {
					dp[i] = dp[j] + 1;
				}
			}
		}
		
		int max = dp[0];
		for(int i=1; i<dp.length; i++) {
			max = Math.max(max, dp[i]);
		}
		System.out.println(max);
		
		br.close();
	}

}
