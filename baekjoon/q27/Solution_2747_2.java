package my.baekjoon.q27;

import java.util.Arrays;
import java.util.Scanner;

public class Solution_2747_2 {

	public static int[] dp;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		
		dp = new int[n+1];
		Arrays.fill(dp, 0);
		System.out.println(fibonacci(n));
	}
	
	public static int fibonacci(int n) {
		if(n < 2) {
			return n;
		}
		if(dp[n] == 0) {
			dp[n] = fibonacci(n-1) + fibonacci(n-2);
		}
		return dp[n];
	}
}
