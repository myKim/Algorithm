package my.baekjoon.q27;

import java.util.Arrays;
import java.util.Scanner;

public class Solution_2747_3 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		
		System.out.println(fibonacci(n));
	}
	
	public static int fibonacci(int n) {
		int[] dp = new int[n+1];
		Arrays.fill(dp, -1);
		
		for(int i=0; i<=n; i++) {
			dp[i] = i < 2 ? i : dp[i-1] + dp[i-2];
		}
		
		return dp[n];
	}
}
