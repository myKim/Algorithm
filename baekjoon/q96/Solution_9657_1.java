package my.baekjoon.q96;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Solution_9657_1 {

	private static final int[] stone = {1, 3, 4};
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		// dp[i] : 돌이 i개 남은 상황에서 현재 가져갈 차례의 사람이 이기면 true / 지면 false
		boolean[] dp = new boolean[N+1];
		Arrays.fill(dp, false);
		dp[0] = false;
		
		for(int i=1; i<dp.length; i++) {
			for(int s : stone) {
				int idx = i-s;
				
				// SK가 이기는 경우가 하나라도 있으면 SK의 승리
				if(idx >= 0) {
					if(!dp[idx]) {
						dp[i] = true;
						break;
					}
				}
			}
		}
		
		String winner = (dp[N]) ? "SK" : "CY";
		System.out.print(winner);
		
		br.close();
	}
	
}
